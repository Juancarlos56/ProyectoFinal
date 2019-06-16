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
public class Cliente extends Persona{
    private String cedula;
    private String tlfConvencional;
    private String tlfCelular;
    private ArrayList<Direccion> direcciones;
    private ArrayList<FacturaCabecera> facturas;
    

    public Cliente() {
        super();
        direcciones = new ArrayList<>();
        facturas = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTlfConvencional() {
        return tlfConvencional;
    }

    public void setTlfConvencional(String tlfConvencional) {
        this.tlfConvencional = tlfConvencional;
    }

    public String getTlfCelular() {
        return tlfCelular;
    }

    public void setTlfCelular(String tlfCelular) {
        this.tlfCelular = tlfCelular;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void addDirecciones(Direccion direcciones) {
        this.direcciones.add(direcciones);
    }

    public ArrayList<FacturaCabecera> getFacturas() {
        return facturas;
    }

    public void addFacturas(FacturaCabecera facturas) {
        this.facturas.add(facturas);
    }
   
  
}
