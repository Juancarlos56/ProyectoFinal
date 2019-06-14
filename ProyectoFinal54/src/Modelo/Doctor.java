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
    private String direccion;
    private ArrayList<Especialidad> especialidades;

    public Doctor() {
        super();
        especialidades = new ArrayList<>();
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void addEspecialidades(Especialidad especialidades) {
        this.especialidades.add(especialidades);
    }

}
