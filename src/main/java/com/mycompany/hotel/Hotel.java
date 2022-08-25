/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hotel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @Anderson Sanabria Hdez
 */
public class Hotel {

    public static void main(String[] args) {
        //Se inicia preguntando la cantidad de reservaciones, para saber la dimension del arreglo.
        int CantidadReservaciones=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite cuantas reservaciones desea realizar"));
        // Se crea el arreglo
        Cliente[] elcliente = new Cliente[CantidadReservaciones];
        for (int i=0; i<elcliente.length; i++){
            elcliente[i]= new Cliente();
            //Se ingresan los datos por medio de JOptionPane.
            elcliente[i].setCliente(JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente"));
            elcliente[i].setApellidos(JOptionPane.showInputDialog(null,"Ingrese el apellido del cliente"));
            int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el día de la reservación"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el mes de la reservación"));
            int año = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el año de la reservación"));
            elcliente[i].setLareservacion(new reservacion(dia, mes, año));
            Habitaciones.habitancion();
            String tamañoHabitación = JOptionPane.showInputDialog(null,"Escriba el tamaño de la habitacion que desea reservar");
            int cantidadDias = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cantidad de días hospetados"));
            elcliente[i].setLashabitaciones(new Habitaciones(cantidadDias, tamañoHabitación));

        }
        for (int i=0;i<elcliente.length;i++){
            JOptionPane.showMessageDialog(null,"La reservación "+ (i+1) + " está a nombre de: "+elcliente[i].getCliente()+" "+elcliente[i].getApellidos());
            JOptionPane.showMessageDialog(null,"La reservación se hizo para el: "+ elcliente[i].Lareservacion.getDia()+"/"+elcliente[i].Lareservacion.getMes()+"/"+elcliente[i].Lareservacion.getAño());
            JOptionPane.showMessageDialog(null,"Usted ha escogido la habitación "+ elcliente[i].Lashabitaciones.getTamaño_habitacion());
            JOptionPane.showMessageDialog(null,"El total a pagar es de: " + elcliente[i].getLashabitaciones().pago(elcliente[i].getLashabitaciones().getTamaño_habitacion(),elcliente[i].getLashabitaciones().getCantidadDe_dias()));
        }//Aquí se imprimen los datos


         
    }
}
    
