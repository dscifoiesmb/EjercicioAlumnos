/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(name = "ServletHeaders", urlPatterns = {"/ServletHeaders"})
public class ServletHeaders extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Procesamos los headers relacionados con la
            //información de la petición
            String metodoHttp=request.getMethod();
            String uri=request.getRequestURI();
           
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Headers HTTP</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Headers HTTP </h1>");
            out.println("Método HTTP: " + metodoHttp);
            out.println("<br>");
            out.println("URI solicitado: " + uri);
            out.println("</br>");
            //Procesamos algunos cabeceros que son parte de la petición
            out.println("<br>");
            out.println("Host: " + request.getHeader("Host"));
            //Procesamos todos los cabeceros
            //estos pueden variar segun el navegador que se utilice
            out.println("</br>");
            out.println("<br>");
            out.println("Navegador: " + request.getHeader("User-Agent"));
            //Procesamos todos los cabeceros
            //estos pueden variar segun el navegador que se utilice
            out.println("</br>");
            out.println("<br>");
            Enumeration cabeceros= request.getHeaderNames();
            while(cabeceros.hasMoreElements()){
                String nombreCabecero = (String) cabeceros.nextElement();
                out.println("<b>" + nombreCabecero + "</b>");
                out.println(request.getHeader(nombreCabecero));
                out.println("<br>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
