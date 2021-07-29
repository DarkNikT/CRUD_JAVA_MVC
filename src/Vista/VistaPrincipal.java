package Vista;

import Constantes.*;
import Controlador.ControladorCRUD;
import Controlador.ControladorListadoAgregar;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaPrincipal extends JFrame {
    //Controlador de la aplicacion
    //private ControladorCRUD controladorCRUD;

    // Boton para mostrar los registros guardados
    private final JButton btnMostrar = new JButton("Mostar registros");
    // Campos para 
    private final  JLabel labelNombre = new JLabel("Ingrese nombre: ");
    private final JTextField fieldNombre = new JTextField(20);    
    private final JLabel labelEdad = new JLabel("Ingrese edad: ");
    private final JTextField fieldEdad = new JTextField(20);
    private final JButton btnAgregar = new JButton("Agregar");
    // Constructor
    public VistaPrincipal(){
        //this.controladorCRUD = controlador;
        JPanel panelAgregar = new JPanel();
        JPanel panelMostrar = new JPanel();
        //panel.setLayout(new La);
        this.setTitle("CRUD test GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 400);
        setLayout(new GridLayout(2, 1));
        panelAgregar.add(labelNombre);
        panelAgregar.add(fieldNombre);
        panelAgregar.add(labelEdad);
        panelAgregar.add(fieldEdad);
        //se agrega un identificador para el evento
        btnAgregar.setActionCommand(AccionesBtns.AGREGAR.name());
        panelAgregar.add(btnAgregar);

        btnMostrar.setActionCommand(AccionesBtns.MOSTRAR.name());
        panelMostrar.add(btnMostrar);

        //Se agregan los paneles al componente JFrame --ventana
        getContentPane().add(panelAgregar);
        getContentPane().add(panelMostrar);
    }

    //Metodo para lanzar la ventana
    public void renderizar(ControladorCRUD controladorCRUD){
        this.setVisible(true);
        btnAgregar.addActionListener(controladorCRUD);
        btnMostrar.addActionListener(controladorCRUD);
                
    }
    public String getNombre(){
        return this.fieldNombre.getText();
    }
    public String getEdad(){
        return this.fieldEdad.getText();
    }
    public void showMensaje(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }


}
