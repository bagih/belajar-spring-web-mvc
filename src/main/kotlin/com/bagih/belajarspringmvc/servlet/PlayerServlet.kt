package com.bagih.belajarspringmvc.servlet

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import java.io.PrintWriter

@WebServlet(urlPatterns = ["/players.do"])
class PlayerServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        super.doGet(req, resp)
        resp?.writer?.let { writer ->
            writer.println("<html>");
            writer.println(
                "<head>" +
                        "<title>Player DB</title>" +
                        "</head>"
            )
            writer.println(
                "<body>" +
                        "<H2>Welcome to the Tennis Players database!</H2>" +
                        "</body>"
            );
            writer.println("</html>")
        }
    }
}