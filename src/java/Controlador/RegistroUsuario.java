/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author reuni
 */
@WebServlet(name = "RegistroUsuario", urlPatterns = {"/RegistroUsuario"})
public class RegistroUsuario extends HttpServlet {

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
            out.println("<title>Registro de Usuario Nuevo</title>");            
            out.println("</head>");
            out.println("<h1>Crea un Usuario Nuevo </h1>");
            out.println("<h1>Porfavor llene los siguientes campos</h1>");         
            out.println("<body>");
            out.println("<p>Ingrese nuevo Usuario: </p>");
            out.println("<p><input type=\"text\" name=\"user\" placeholder=\"Ingrese Id \" required spellchek=\"false\" > </p>");
            out.println("<p>Ingrese nueva Contraseña: </p>");
            out.println("<p><input type=\"password\" name=\"pass\" placeholder=\"Ingrese contraseña\" required spellchek=\"false\" > </p>");
            out.println("<form onclick=guardar(); method=\"post\">\n");
            out.println("<input type=\"submit\" value=\"Registrar\" name=\"registrobutton\"/> \n");         
            out.println("</form>");
            out.println("<input type=\"submit\" onClick=\"history.back()\" value=\"Regresar\" name=\"regresoButton\"/> \n");         
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
