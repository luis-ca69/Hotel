/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

import javax.swing.JOptionPane;

/**
 * @author Usuario
 */
//Se crean los atributos 
public class Habitaciones {
  private int CantidadDe_dias;
  private String Tamaño_habitacion;
 //se crea el constructor y los setters y getters
  public Habitaciones(int CantidadDe_dias, String Tamaño_habitacion) {
    this.CantidadDe_dias = CantidadDe_dias;
    this.Tamaño_habitacion = Tamaño_habitacion;
  }


  public int getCantidadDe_dias() {
    return CantidadDe_dias;
  }

  public void setCantidadDe_dias(int CantidadDe_dias) {
    this.CantidadDe_dias = CantidadDe_dias;
  }

  public String getTamaño_habitacion() {
    return Tamaño_habitacion;
  }

  public void setTamaño_habitacion(String Tamaño_habitacion) {
    this.Tamaño_habitacion = Tamaño_habitacion;
  }
// se crea un método de un arreglo para indicar el tamaño de la habitacion y el precio
  public static void habitancion() {
    String precio[][] = new String[3][2];
    precio[0][0] = "Pequeño ";
    precio[0][1] = "10000";
    precio[1][0] = "Mediano ";
    precio[1][1] = "15000 ";
    precio[2][0] = "Grande ";
    precio[2][1] = "25000 ";
    JOptionPane.showMessageDialog(null, "Estos son los tamaños y precios de las habitaciones:" + "\n" + precio[0][0] + precio[0][1] + "\n" + precio[1][0] + precio[1][1] + "\n" + precio[2][0] + precio[2][1]);
  }
//Se crea otro metodo para indicar el total a pagar de la persona después de elegir la habitación y los días de hospedaje 
  public int pago(String Tamaño_habitacion, int CantidadDe_dias) {
    int total = 0;
    switch (Tamaño_habitacion){
      case "pequeña":
        total = CantidadDe_dias * 10000;
        break;
      case "mediana":
        total = CantidadDe_dias * 15000;
        break;
      case "grande":
        total = CantidadDe_dias * 25000;
        break;
    }
    return total;
  }
}
