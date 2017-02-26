/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author entrar
 */
@WebServlet(name = "MostrarMensaje", urlPatterns = {"/MostrarMensaje"})
public class MostrarMensaje extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MostrarMensaje</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MostrarMensaje </h1>");
            out.println("<h2>Lista de nombres:</h1>");
            ArrayList<String> list=(ArrayList)request.getAttribute("lista");
            if(list!=null)
                for(String nombre: list)
                {
                    out.println("<p>"+nombre+"</p>");
                }
            
            
            out.println("<form action='FrontController'>");
            out.println("<input type='hidden' name='command' value='Comando1'/>");
            out.println("<input type='text' name='lista' value=''/>");
            out.println("<input type='submit' value='Enviar Comando1' />");
            out.println("</form>");
            
            out.println("<form action='FrontController'>");
            out.println("<input type='hidden' name='command' value='Comando2'/>");
            out.println("<input type='submit' value='Enviar Comando2' />");
            out.println("</form>");
            
            out.println("<form action='FrontController'>");
            out.println("<input type='hidden' name='command' value='Comando3'/>");
            out.println("<input type='submit' value='Enviar Comando3' />");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
