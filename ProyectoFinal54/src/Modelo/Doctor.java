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
public class Doctor extends Persona{
    private String correo;

    public Doctor() {
        super();
    }

    public String getCorreo() {
        return correo;
    }

    public void setDireccion(String correo) {
        this.correo = correo;
    }
}
