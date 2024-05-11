/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author USUARIO
 */
@WebServlet(name = "ProcesarRegistroEInicioDeSesion", urlPatterns = {"/ProcesarRegistroEInicioDeSesion"})
public class ProcesarRegistroEInicioDeSesion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @param msg
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String msg)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcesarRegistro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProcesarRegistro at " + msg + "</h1>");
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
        
            String user = request.getParameter("usuario");
            String pass = request.getParameter("clave");
            
            if("admin".equals(user) && "1234".equals(pass)){
                processRequest(request, response, "Inicio de sesion exitoso");
            }
            else{
                processRequest(request, response, "Error: Usuario o contraseña no validos.");
            }
            
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
        
     String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        // Verifica si el username, email y password son correctos
        if ("santirh".equals(username) && "santrh14@gmail.com".equals(email) && "1234".equals(password)) {
            response.getWriter().println("<h2>Formulario de Registro</h2>");
            response.getWriter().println("<p>Registro exitoso para: " + username + "</p>");
        } else {
            response.getWriter().println("<h2>Formulario de Registro</h2>");
            response.getWriter().println("<p>Error: Usuario, email o contraseña no validos.</p>");
        }
            
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
