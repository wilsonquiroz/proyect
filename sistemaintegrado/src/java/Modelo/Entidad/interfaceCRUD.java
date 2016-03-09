
package Modelo.Entidad;

import java.sql.ResultSet;


public interface interfaceCRUD {
                                              
    public abstract boolean agregarRegistro();// opcion 1
    public abstract boolean borrarRegistro();// opcion 2
    public abstract boolean actualizarRegistro();//opcion 3
    
    
    public abstract ResultSet consultarRegistro();//opcion 4
    public abstract ResultSet listarTabla();// opcion 5
    
}
