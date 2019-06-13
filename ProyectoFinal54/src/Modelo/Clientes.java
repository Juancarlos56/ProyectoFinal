/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Carlos
 */
public class Clientes extends Persona{
    private String tlfConvencional;
    private String tlfCelular;

    @Override
    public String toString() {
        return "Clientes{"+"id=" + getId() + ", cedula=" + getCedula() + ", nombre=" + getNombre() + ", apellido=" + getApellido() + "tlfConvencional=" + tlfConvencional + ", tlfCelular=" + tlfCelular + '}';
    }
    
    
  
}
