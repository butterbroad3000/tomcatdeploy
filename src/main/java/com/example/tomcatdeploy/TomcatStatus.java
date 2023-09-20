package com.example.tomcatdeploy;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet(name = "tomcatStatus", value = "/tomcat-status")
//public class TomcatStatus extends HttpServlet {
//    private String message;
//
//    public void init() {
//        try {
           //  Создаем процесс для выполнения команды sudo systemctl status tomcat
//            ProcessBuilder processBuilder = new ProcessBuilder("sudo", "systemctl", "status", "tomcat");
//            processBuilder.redirectErrorStream(true); // Перенаправляем stderr в stdout
//            Process process = processBuilder.start();
//
           //  Читаем вывод команды
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            StringBuilder commandOutput = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                commandOutput.append(line).append("<br>");
//            }
//            reader.close();
//
        //     Ожидаем завершения процесса
//            int exitCode = process.waitFor();
//
//            if (exitCode == 0) {
//                message = "Command Output:<br>" + commandOutput.toString();
//            } else {
//                message = "Command Failed with Exit Code: " + exitCode;
//            }
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }}
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
      //   Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println(  message );
//        out.println("</body></html>");
//    }
//
//    public void destroy() {
//    }
//}