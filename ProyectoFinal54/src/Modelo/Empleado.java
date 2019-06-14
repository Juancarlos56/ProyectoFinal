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
public class Empleado extends Persona{
    private String cedula;
    private char[] cargo;
    private ArrayList<FacturaCabecera> facturas; 

    public Empleado() {
        super();
        cargo = new char[2];
        facturas = new ArrayList<>();
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char[] getCargo() {
        return cargo;
    }

    public void setCargo(char[] cargo) {
        this.cargo = cargo;
    }

    public ArrayList<FacturaCabecera> getFacturas() {
        return facturas;
    }

    public void addFacturas(FacturaCabecera factura) {
        this.facturas.add(factura);
    }
    
    
}
