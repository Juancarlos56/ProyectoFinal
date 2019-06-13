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
    private ArrayList<Clientes> cliente;
    private Empleado empleado;
}
