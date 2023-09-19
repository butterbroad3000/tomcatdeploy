package com.example.tomcatdeploy;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "tomcatStatus", value = "/tomcat-status")
public class TomcatStatus extends HttpServlet {
    private String message;

    public void init() {
        try{
            Process process =Runtime.getRuntime().exec("sudo systemctl status tomcat");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder stringBuilder=new StringBuilder();
            String line;
            while (bufferedReader.readLine()!=null) {
                stringBuilder.append(bufferedReader.readLine()).append("<br>");


            }
            bufferedReader.close();
            message="<h1><%= \"Tomcat status\" %></h1><br>"+stringBuilder.toString();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println(  message );
        out.println("</body></html>");
    }

    public void destroy() {
    }
}