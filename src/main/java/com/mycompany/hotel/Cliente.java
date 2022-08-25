/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author Usuario
 */
//Se crean los atributos y se invocan las clases anteriores
public class Cliente {
    
    private String cliente;
    private String apellidos;
    public reservacion Lareservacion;
    public Habitaciones Lashabitaciones;

    public Cliente() {
    }
//Se crea el constructor y los setters y getters con las clases invocadas
    public Cliente(String cliente, String apellidos, reservacion Lareservacion, Habitaciones Lashabitaciones) {
        this.cliente = cliente;
        this.apellidos = apellidos;
        this.Lareservacion = Lareservacion;
        this.Lashabitaciones = Lashabitaciones;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public reservacion getLareservacion() {
        return Lareservacion;
    }

    public void setLareservacion(reservacion Lareservacion) {
        this.Lareservacion = Lareservacion;
    }

    public Habitaciones getLashabitaciones() {
        return Lashabitaciones;
    }

    public void setLashabitaciones(Habitaciones Lashabitaciones) {
        this.Lashabitaciones = Lashabitaciones;
    }
    
}
