/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Entidad.BeanPedido;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHADY-
 */
@WebServlet(name = "ConsultaPedidos", urlPatterns = {"/ConsultaPedidos"})
public class ConsultaPedidos extends HttpServlet {

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
        try{
            ClassConex con = new ClassConex();
            Connection cn = con.ObtenerConexion(); 
                
            Statement stm = cn.createStatement();
            String query = "select * from sistram.pedidos;";
            ResultSet rs = stm.executeQuery(query);
            HttpSession hts = (HttpSession)request.getSession(true);
            ArrayList<Object> pedidos = new ArrayList<> ();
            while(rs.next()){
                Pedidos p = new Pedidos();
                p.setIdpedido(rs.getString(2));
                p.setOrigen(rs.getString(3));
                p.setDestino(rs.getString(4));
                p.setProducto(rs.getString(5));
                p.setCantidad(rs.getString(6));
                p.setFechapedido(rs.getString(7));
                p.setFechaentrega(rs.getString(8));
                p.setUsuario(rs.getString(9));
                
                pedidos.add(p);
            }
           hts.setAttribute("pedidos", pedidos);
           response.sendRedirect("VerPedidosCliente.jsp");
            con.CerrarConexion();
        }catch(SQLException e){
            System.out.println(e);
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
