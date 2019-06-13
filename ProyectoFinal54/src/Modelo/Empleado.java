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
public class Empleado extends Persona{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo +"id=" + getId() + ", cedula=" + getCedula() + ", nombre=" + getNombre() + ", apellido=" + getApellido() + '}';
    }
    
}
