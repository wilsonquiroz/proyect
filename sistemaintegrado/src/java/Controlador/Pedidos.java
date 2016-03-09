/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SHADY-
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findByIdtable1", query = "SELECT p FROM Pedidos p WHERE p.idtable1 = :idtable1"),
    @NamedQuery(name = "Pedidos.findByIdpedido", query = "SELECT p FROM Pedidos p WHERE p.idpedido = :idpedido"),
    @NamedQuery(name = "Pedidos.findByOrigen", query = "SELECT p FROM Pedidos p WHERE p.origen = :origen"),
    @NamedQuery(name = "Pedidos.findByDestino", query = "SELECT p FROM Pedidos p WHERE p.destino = :destino"),
    @NamedQuery(name = "Pedidos.findByProducto", query = "SELECT p FROM Pedidos p WHERE p.producto = :producto"),
    @NamedQuery(name = "Pedidos.findByCantidad", query = "SELECT p FROM Pedidos p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Pedidos.findByFechapedido", query = "SELECT p FROM Pedidos p WHERE p.fechapedido = :fechapedido"),
    @NamedQuery(name = "Pedidos.findByFechaentrega", query = "SELECT p FROM Pedidos p WHERE p.fechaentrega = :fechaentrega"),
    @NamedQuery(name = "Pedidos.findByUsuario", query = "SELECT p FROM Pedidos p WHERE p.usuario = :usuario")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtable1")
    private Integer idtable1;
    @Size(max = 45)
    @Column(name = "idpedido")
    private String idpedido;
    @Size(max = 45)
    @Column(name = "origen")
    private String origen;
    @Size(max = 45)
    @Column(name = "destino")
    private String destino;
    @Size(max = 45)
    @Column(name = "producto")
    private String producto;
    @Size(max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @Size(max = 15)
    @Column(name = "fechapedido")
    private String fechapedido;
    @Size(max = 15)
    @Column(name = "fechaentrega")
    private String fechaentrega;
    @Size(max = 45)
    @Column(name = "usuario")
    private String usuario;

    public Pedidos() {
    }

    public Pedidos(Integer idtable1) {
        this.idtable1 = idtable1;
    }

    public Integer getIdtable1() {
        return idtable1;
    }

    public void setIdtable1(Integer idtable1) {
        this.idtable1 = idtable1;
    }

    public String getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(String idpedido) {
        this.idpedido = idpedido;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(String fechapedido) {
        this.fechapedido = fechapedido;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtable1 != null ? idtable1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.idtable1 == null && other.idtable1 != null) || (this.idtable1 != null && !this.idtable1.equals(other.idtable1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Pedidos[ idtable1=" + idtable1 + " ]";
    }
    
}
