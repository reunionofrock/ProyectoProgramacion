/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Lista;
import Modelo.ListaUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author reuni
 */
@WebServlet(name = "UsuarioLista", urlPatterns = {"/UsuarioLista"})
public class UsuarioLista extends HttpServlet {

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
            
           String user = request.getParameter("user");
           String pass = request.getParameter("pass");
           ListaUsuario miLista = new ListaUsuario();
           miLista.push(user, pass);
           
          HttpSession session = request.getSession();
           Lista ListaU = null;
           ListaU = (Lista) session.getAttribute("ListaU");
           Lista nodo = new Lista(user,pass);
              nodo.setSiguiente(ListaU);
              ListaU = nodo;
              session.setAttribute("ListaU", ListaU);
        
            if (ListaU == null){
                ListaU = new Lista(user,pass);
                session.setAttribute("ListaU", ListaU);
            }else{
              Lista nodo1 = ListaU;
              while(nodo1!=null){
                 out.println("<h5>Datos " + nodo1.getContraseña() + nodo1.getUsuario() +" en Lista</h5>");               
                 nodo1 = nodo1.getSiguiente();
              }
              
            }
            out.println("<!DOCTYE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>DATOS LISTA</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form method=\"post\" action=\"index.html\">"); 
            out.println("<div><H1 align=\"left\"><strong><input type=\"submit\" value=\"Regresar a Ingreso\" /></strong></H1></div>");        
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
