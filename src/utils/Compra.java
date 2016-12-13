/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author lalo
 */
public class Compra implements Serializable{
    
    private List<Productos> productos;
    private int total;
    private String usuario;

    public Compra(List<Productos> productos, int total, String usuario) {
        this.productos = productos;
        this.total = total;
        this.usuario = usuario;
    }
    
    

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
