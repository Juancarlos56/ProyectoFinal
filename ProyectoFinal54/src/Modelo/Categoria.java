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
public class Categoria {
    private int id;
    private String nombreSubCategoria;
    private ArrayList<SubCategoria> subcategorias;

    public Categoria() {
        subcategorias = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSubCategoria() {
        return nombreSubCategoria;
    }

    public void setNombreSubCategoria(String nombreSubCategoria) {
        this.nombreSubCategoria = nombreSubCategoria;
    }

    public ArrayList<SubCategoria> getSubcategorias() {
        return subcategorias;
    }

    public void addSubcategorias(SubCategoria subcategorias) {
        this.subcategorias.add(subcategorias);
    }
    
}
