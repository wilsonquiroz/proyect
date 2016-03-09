/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Controlador.ClassConex;
/**
 *
 * @author SHADY-
 */
@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

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

            ClassConex link = new ClassConex();

            Connection cn = link.ObtenerConexion();

           

            HttpSession sesion = (HttpSession) request.getSession(true);

            String Usuario = request.getParameter("usuario");
            String Contrasena = request.getParameter("password");
       
            String query = "SELECT * FROM usuarios WHERE usuario='" + Usuario + "' and  pss='" + Contrasena + "';";

            
            System.out.println(query);
           
            Statement stm = cn.createStatement();
            ResultSet sm = stm.executeQuery(query);
            if (sm.next()) {
                sesion.setAttribute("usuario", Usuario);
                String NomUsuario = (String)sm.getString(4);
                sesion.setAttribute("nombre", NomUsuario);
                String Rol = (String)sm.getString(5);
                sesion.setAttribute("rol", Rol);
                String md = (String) sesion.getAttribute("Usuario");
                PrintWriter pw = response.getWriter();
                 System.out.println(Rol);
                 
                 if(Rol.equals("Admin")){
                 response.sendRedirect("SesionAdmin.jsp");
                    pw.close();
                

                 }else if (Rol.equals("cliente")){

                     response.sendRedirect("SesionCliente.jsp");
                    pw.close();

                 }else if (Rol.equals("Asistente")){

                     response.sendRedirect("SesionAsistente.jsp");
                    pw.close();

                 }else if (Rol.equals("jefe")){

                     response.sendRedirect("SesionJefeFac.jsp");
                    pw.close();

                 }
               
             
            } else {

                response.sendRedirect("Error.jsp");
            }

            link.CerrarConexion();

        } catch (SQLException e) {

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
