
package Modelo.Entidad;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Entidad.BeanUsuario;
import Modelo.Entidad.interfaceCRUD;
import Controlador.*;


public class DaoPedido extends ClassConex implements  interfaceCRUD{
    
    public Connection conn=null;
    public Statement st=null;
    public ResultSet rs=null;
    
    
    public boolean encontrado=false;
    public boolean listo = false;
    
    
    public String idpedido="";
    public String origen="";
    public String destino="";
    public String producto="";
    public String cantidad;
    public String fechapedido="";
    public String fechaentrega="";
    public String usuario="";
    
    
    
    /**
     *
     * @param cliente
     */
    public DaoPedido(BeanPedido bpedido) {
        super();
        try {
            conn = this.ObtenerConexion();
            st = conn.createStatement();
            
            idpedido  = bpedido.getIdpedido();
            origen    = bpedido.getOrigen();
            destino   = bpedido.getDestino();
            producto  = bpedido.getProducto();
            cantidad  = bpedido.getCantidad();
            fechapedido =bpedido.getFechapedido();
            fechaentrega = bpedido.getFechaentrega();
            usuario      =  bpedido.getUsuario();
                    
                    
        } catch (SQLException ex) {
            Logger.getLogger(DaoPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    

    public boolean agregarRegistro() { //opcion 1.
        try {
            st.executeUpdate("INSERT INTO pedidos (idpedido,origen,destino,producto,cantidad,fechapedido,fechaentrega,usuario)" + "values ("+idpedido+","+origen+","+destino+","+producto+","+cantidad+","+fechapedido+","+fechaentrega+","+usuario+");");
            listo=true;
            System.out.print(st);
        } catch (SQLException ex) {
            Logger.getLogger(DaoPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listo;
    }

   
    public boolean borrarRegistro() {// opcion 2.
        try {
            
            st.executeUpdate("delete from pedidos where idpedido='"+idpedido+"';");
            listo=true;
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoPedido.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        return listo;
    }

   
    public boolean actualizarRegistro() { //opcion 3.
        try {
            st.executeUpdate("");
            listo=true;
           
        } catch (SQLException ex) {
            Logger.getLogger(DaoPedido.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        return listo;
    }

    
    public ResultSet consultarRegistro() { //opcion 4.
         try {        
            rs = st.executeQuery("SELECT id_cliente,nom_cliente,ape_cliente, genero_cliente  FROM cliente where id_cliente='';");
        } catch (SQLException ex) {
            Logger.getLogger(DaoPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rs;
    }


    public ResultSet listarTabla() { //opcion 5.
        try {        
            rs = st.executeQuery("SELECT *  FROM pedidos");
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rs;
        
    }
    
}
