/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Entidad;

/**
 *
 * @author SHADY-
 */
public class BeanPedido {
    
    private String idpedido;
    private String origen;
    private String destino;
    private String producto;
    private String cantidad;
    private String fechapedido;
    private String fechaentrega;
    private String usuario;

    public BeanPedido(String idpedido, String origen, String destino, String producto, String cantidad, String fechapedido, String fechaentrega, String usuario) {
        this.idpedido = idpedido;
        this.origen = origen;
        this.destino = destino;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechapedido = fechapedido;
        this.fechaentrega = fechaentrega;
        this.usuario = usuario;
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


  
}