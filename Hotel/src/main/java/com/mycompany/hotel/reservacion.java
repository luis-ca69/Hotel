/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author Usuario
 */
//se crean los atributos
public class reservacion {
    private int dia;
    private int mes;
    private int año;

//Se crea el constructor y los setter y getters
    public reservacion( int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
