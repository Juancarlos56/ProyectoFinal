/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class FacturaCompra {
    
    private int id;
    private String razonAdquisicion;
    private int cantidadCompra;
    private Proveedor proveedor;
    private ArrayList<Producto> productos;

    public FacturaCompra() {
        proveedor = new Proveedor();
        productos = new ArrayList<>();
    }
    
    public boolean actualizarStock(){
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonAdquisicion() {
        return razonAdquisicion;
    }

    public void setRazonAdquisicion(String razonAdquisicion) {
        this.razonAdquisicion = razonAdquisicion;
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProductos(Producto productos) {
        this.productos.add(productos);
    }
    
}
