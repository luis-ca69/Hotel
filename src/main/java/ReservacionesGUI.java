package com.mycompany.hotel;
import javax.swing.*;

//Se crea con JFrame un formulario para la interfaz grafica
public class ReservacionesGUI extends JFrame {

    // A partir de aqui se empiezan a crear los items de la interfaz
    // JPanel: son paneles de texto para que el usuario ingrese los datos
    // JLabel: Son etiquetas, titulos y subtitulos para los JPanel
    //JList: lista de items para que los vea el usuario
    //JButton:Boton de enviar


    // sobre el panel principal va montado el formulario
    private JPanel panelPrincipal;

    // Titulo del formulario
    private JLabel Titulo;

    //Informacion basica del usuario
    private JLabel LabelinfoCliente;
    private JTextField Nombre;
    private JLabel labelNombre;
    private JTextField Apellido;
    private JLabel labelApellido;

    //informacion de la reservacion
    private JTextField reservDia;
    private JLabel labelDia;
    private JTextField reservMes;
    private JLabel labelMes;
    private JTextField reservAño;
    private JLabel labelAño;

    //Informacion de las habitaciones
    private JLabel habInformacion;
    private JList habTipos;
    private JTextField habSeleccion;
    private JLabel labelHabSeleccion;

    //informacion del hospedaje
    private JTextField Hospedaje;
    private JLabel labelHospedaje;

    //Boton de enviar
    private JButton Enviar;


    public ReservacionesGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelPrincipal);
        this.pack();
    }
    public static void (String[] args){
        JFrame frame = new ReservacionesGUI("Reservaciones");
        frame.setVisible(true);
    }
}
