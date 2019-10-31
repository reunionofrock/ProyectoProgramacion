/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pila;
import Modelo.PilaEstudiante;
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
@WebServlet(name = "EstudiantePila", urlPatterns = {"/EstudiantePila"})
public class EstudiantePila extends HttpServlet {

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
            
            String nombre = request.getParameter("nombre");
            String carnet = request.getParameter("carnet");
            String born = request.getParameter("born");
         
                Pila miPila= new Pila();
                miPila.push(nombre, carnet, born);
           
                HttpSession pilaEst = request.getSession();
                PilaEstudiante PilaU = null;
                PilaU = (PilaEstudiante) pilaEst.getAttribute("PilaU");
                PilaEstudiante nodo = new PilaEstudiante(nombre, carnet, born);
                nodo.setSiguiente(PilaU);
                PilaU = nodo;
                pilaEst.setAttribute("PilaU", PilaU);
        
                if (PilaU == null){
                    PilaU = new PilaEstudiante(nombre,carnet, born);
                    pilaEst.setAttribute("PilaU", PilaU);
                }else{
                    PilaEstudiante nodo1 = PilaU;
                    while(nodo1!=null){
                    out.println("<h5>Datos " + nodo1.getNombre() + nodo1.getCarnet() + nodo1.getBorn() + " en Lista</h5>");               
                    nodo1 = nodo1.getSiguiente();
                }
              
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Estudiantes en la Pila</title>");            
            out.println("</head>");
            out.println("<body>");
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
