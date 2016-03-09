/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entidad.BeanPedido;
import Modelo.Entidad.DaoPedido;
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

/**
 *
 * @author SHADY-
 */
@WebServlet(name = "ServletPedido", urlPatterns = {"/ServletPedido"})
public class ServletPedido extends HttpServlet {

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
           ClassConex link = new ClassConex();
            try{Connection cn = link.ObtenerConexion(); 
                
            Statement stm = cn.createStatement();
            
                String idpedido = "\""+request.getParameter("npedido")+"\"";
                String origen =  "\""+request.getParameter("origen")+"\"";
                String destino=  "\""+request.getParameter("destino")+"\"";
                String producto=  "\""+request.getParameter("producto")+"\"";
                String cantidad= "\""+request.getParameter("cantidad")+"\"";
                String fechapedido=  "\""+request.getParameter("fechap")+"\"";
                String fechaentrega=  "\""+request.getParameter("fechae")+"\"";
                String usuario=  "\""+request.getParameter("usuario")+"\"";
                
                
              BeanPedido BcPedido = new BeanPedido(idpedido, origen, destino, producto,cantidad, fechapedido, fechaentrega, usuario);
              DaoPedido DcPedido=new DaoPedido(BcPedido);
              ResultSet rs; 
             
              
             
            
              String mExito="Operacion exitosa, Felicidades!!!!"; 
              String mError="Operacion Fallida, Lo siento mucho!!!!";
         
         
           // AGREGAR REGISTROS
                if(DcPedido.agregarRegistro()){
                    request.setAttribute("mensaje", "Registro agregado exitosamente");
                }else{request.setAttribute("mensaje", "El registro no se pudo guardar");}
                
                request.getRequestDispatcher("CrearPedido.jsp").forward(request, response);
            
                
            
            
      
               
              
             
            }catch(SQLException e){
            
            e.printStackTrace();}
        
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
