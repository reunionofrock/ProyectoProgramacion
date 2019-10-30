/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Lista;
import Modelo.ListaUsuario;
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
@WebServlet(name = "OperationServlet", urlPatterns = {"/OperationServlet"})
public class OperationServlet extends HttpServlet {

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
            
//            //botones de accion
//            
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            //
            // esto va del lado de del registro usuario
            
//            ListaUsuario misUsuarios = new ListaUsuario();
//            misUsuarios.push(user, pass);
//            
//           HttpSession session = request.getSession();
//           Lista ListaU = null;
//           ListaU = (Lista) session.getAttribute("ListaU");
//           Lista nodo = new Lista(user,pass);
//              nodo.setSiguiente(ListaU);
//              ListaU = nodo;
//              session.setAttribute("ListaU", ListaU);
//        
//            if (ListaU == null){
//                ListaU = new Lista(user,pass);
//                session.setAttribute("ListaU", ListaU);
//            }else{
//              Lista nodo1 = ListaU;
//              while(nodo1!=null){
//                 out.println("<h5>Datos " + nodo1.getContraseña() + nodo1.getUsuario() +" en Lista</h5>");               
//                 nodo1 = nodo1.getSiguiente();
//              }
//              
//            }
            
            // aqui lo que va es un pop ppara buscar si el usuario existe
            
            //ListaUsuario.pop();
            
             if(user.equals("kzea")&&(pass.equals("umg123"))){
                
             
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<h1>Bienvenido Usuario "+ user + "</h1>");
                out.println("<title>Menu</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Que desea hacer? </h1>");
                out.println("");
                out.println("");
                out.println("");
                out.println("<p> Usuarios </p>"); 
                out.println("<form action=\"RegistroUsuario\" method=\"post\">");
                out.println("<input type=\"submit\" value=\"Usuario Nuevo?\" id=\"registro\" name=\"registro\"/> ");
                out.println("</form>");
                out.println("");
                
                out.println("<p> Lista de Usuarios </p>");
               
                
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
                  
                out.println("");
                out.println(""); 
                out.println("");
                out.println("");
                out.println("");
                out.println("");
                out.println("<p> Estudiantes </p>");
                out.println("<form action=\"RegistroEstudiante\" method=\"post\">");
                out.println("<input type=\"submit\" value=\"Estudiante Nuevo?\"  name=\"registroEstudiante\"/>");
                out.println("</form>");
                
//            String nombre = request.getParameter("nombre");
//            String carnet = request.getParameter("carnet");
//            String born = request.getParameter("born");
//            
////            HttpSession session = request.getSession();
//            PilaEstudiante PilaU = null;
//            PilaU = (PilaEstudiante) session.getAttribute("ListaU");
//            PilaEstudiante Nodo = new PilaEstudiante(nombre, carnet, born);
//              Nodo.setSiguiente(PilaU);
//              PilaU = Nodo;
//              session.setAttribute("ListaU", ListaU);
//        
//            if (PilaU == null){
//                PilaU = new PilaEstudiante(nombre, carnet, born);
//                session.setAttribute("ListaU", ListaU);
//            }else{
//              PilaEstudiante nodo1 = PilaU;
//              while(nodo1!=null){
//                 out.println("<h5>Datos " + nodo1.getNombre() + nodo1.getCarnet() + nodo1.getBorn() +" en Pila</h5>");               
//                 nodo1 = nodo1.getSiguiente();
//              }
              
                out.println("<form action=\"EstudiantePila\" method=\"post\">");
                out.println("<input type=\"submit\" value=\"Lista de Estudiantes\" name=\"MostrarEstudiantes\"/>");
                out.println("</form>");
                out.println("");
                out.println("");
                out.println("");
                out.println("");
                out.println("");
                out.println("");
                out.println("</body>");
                out.println("</html>");
                }
//            }
             else{
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<h1>Usuario o contraseña incorrectos</h1>");
                out.println("<title>Error</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Volver</h1>");
                out.println("");
                out.println("");
                out.println("<p>Datos de inicio de sesion incorrectos</p>");
                out.println("<p>Por favor vuelva a intentarlo</p>");
                out.println("<form action= index.jsp method=\"post\">");
                out.println("<input type=\"submit\" value=\"Intente de Nuevo\" name=\"volverbutton\"/> ");
                out.println("</form>");
                out.println("");
                out.println("<p>El usuario no existe</p>");
                out.println("</body>");
                out.println("</html>");
                 
             }
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
    
