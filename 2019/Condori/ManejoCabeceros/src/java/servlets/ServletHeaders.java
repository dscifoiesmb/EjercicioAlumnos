package servlets;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ServletHeaders", urlPatterns = {"/ServletHeaders"})
public class ServletHeaders extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            //Procesamos los headers relacionados con la informacion de la peticion
            String metodoHttp = request.getMethod();
            String url = request.getRequestURI();
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Headers HTTP</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Headers HTTP</h1>");
            out.println("Metodo Http: "+metodoHttp);
            out.println("<br>");
            //Procesamos algunos cabeceras que son parte de la peticion
            out.println("Host: "+request.getHeader("Host"));
            out.println("<br>");
            out.println("Navegador: "+request.getHeader("User-Agent"));
            //Procesamos todos los cabeceros
            //estos pueden variar segun el navegador que se utilice
            out.println("<br>");
            out.println("<br>");
            Enumeration cabeceros = request.getHeaderNames();
            while (cabeceros.hasMoreElements()){
                String nombreCabecero = (String) cabeceros.nextElement();
                out.println("<b>"+nombreCabecero + "</b>: ");
                out.println(request.getHeader(nombreCabecero));
                out.println("<br>");
            }
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
}
