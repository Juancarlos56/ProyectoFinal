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
public class Direccion {
    
    private int id;
    private String callePrincipal;
    private String calleSecundaria;
    private String codigoPostal;
    private String ciudadNombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudadNombre() {
        return ciudadNombre;
    }

    public void setCiudadNombre(String ciudadNombre) {
        this.ciudadNombre = ciudadNombre;
    }

    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", callePrincipal=" + callePrincipal + ", calleSecundaria=" + calleSecundaria + ", codigoPostal=" + codigoPostal + ", ciudadNombre=" + ciudadNombre + '}';
    }
    
    
}
