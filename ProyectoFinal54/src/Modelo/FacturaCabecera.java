/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos
 */
public class FacturaCabecera {
    private int id;
    private Date fechaVenta;
    private double subtotal;
    private double descuento;
    private double adicionalEnvio;
    private double valorTotal;
    private char estado;
    private ArrayList<FacturaDetalle> detalle;
    private Cliente cliente;
    private Empleado empleado;   
    private ArrayList<RecetaMedica> recetas;

    public FacturaCabecera() {
        detalle = new ArrayList<>();
        recetas = new ArrayList<>();
        cliente = new Cliente();
        empleado = new Empleado();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getAdicionalEnvio() {
        return adicionalEnvio;
    }

    public void setAdicionalEnvio(double adicionalEnvio) {
        this.adicionalEnvio = adicionalEnvio;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public ArrayList<FacturaDetalle> getDetalle() {
        return detalle;
    }

    public void addDetalle(FacturaDetalle detalle) {
        this.detalle.add(detalle);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public ArrayList<RecetaMedica> getRecetas() {
        return recetas;
    }

    public void setRecetas(RecetaMedica recetas) {
        this.recetas.add(recetas);
    }
    
}
