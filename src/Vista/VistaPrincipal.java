package Vista;

import Constantes.*;
import Controlador.ControladorCRUD;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//clase de interfaz principal de ejecución
public class VistaPrincipal extends JFrame {
    // Componentes del panel mostrar
    private final JButton btnMostrar = new JButton("Mostar registros");// Boton para mostrar los registros guardados
    private final JTable tablePersonas;
    // Componentes del panel agregar
    private final  JLabel labelNombre = new JLabel("Ingrese nombre: ");
    private final JTextField fieldNombre = new JTextField(20);    
    private final JLabel labelEdad = new JLabel("Ingrese edad: ");
    private final JTextField fieldEdad = new JTextField(20);
    private final JButton btnAgregar = new JButton("Agregar");
    // Constructor
    public VistaPrincipal(){
        
        JPanel panelAgregar = new JPanel();
        JPanel panelMostrar = new JPanel();
        
        this.setTitle("CRUD test GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        //Layout de la ventana
        GridBagLayout layoutVentana = new GridBagLayout();
        
        GridBagConstraints constraintsLayout = new GridBagConstraints();
        setLayout(layoutVentana);
        /*
        //No se está usando, los campos y botones generados son grandes, muy cuadriculados
        GridLayout gridLayout = new GridLayout(2, 2);
        panelAgregar.setLayout(gridLayout);
        */

        //Se usa un gropLayout para organizar los componentes del panel agregar
        GroupLayout groupLayout = new GroupLayout(panelAgregar);
        panelAgregar.setLayout(groupLayout);
        
        groupLayout.setAutoCreateGaps(true);  
        groupLayout.setAutoCreateContainerGaps(true);  
        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(labelNombre)
                .addComponent(labelEdad))
            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(fieldNombre)
                .addComponent(fieldEdad)
                .addComponent(btnAgregar))
        );
       
        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelNombre)
                .addComponent(fieldNombre))
            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelEdad)
                .addComponent(fieldEdad))
            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(btnAgregar))
        );
       
        panelAgregar.add(labelNombre);
        panelAgregar.add(fieldNombre);
        panelAgregar.add(labelEdad);
        panelAgregar.add(fieldEdad);
        //se agrega un identificador para el evento de click en el boton agregar
        btnAgregar.setActionCommand(AccionesBtns.AGREGAR.name());
        panelAgregar.add(btnAgregar);

        //Darle fondo al panel de agregar
        panelAgregar.setBackground(Color.WHITE);
        panelAgregar.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createEtchedBorder(), "Panel agregar datos", TitledBorder.CENTER, TitledBorder.TOP));
        
        
        //configurando panel mostrar
        panelAgregar.setBackground(Color.WHITE);
        panelMostrar.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Panel mostrar datos", TitledBorder.CENTER, TitledBorder.TOP));
    
        btnMostrar.setActionCommand(AccionesBtns.MOSTRAR.name());
        panelMostrar.add(btnMostrar);

        //tabla
        String [][] regs = {{ "", "", "" }};
        String[] headers = { "No", "Nombre", "Edad" };
        tablePersonas = new JTable(regs, headers);
        JScrollPane scrollTabla = new JScrollPane();
        scrollTabla.setViewportView(tablePersonas);
        scrollTabla.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panelMostrar.add(scrollTabla, BorderLayout.CENTER);
        // Layout panel mostrar

        //Se agregan los paneles al componente JFrame --ventana
        constraintsLayout.fill = GridBagConstraints.HORIZONTAL; // crecimiento horizontal
        constraintsLayout.gridx = 0;                            // columna 0
        constraintsLayout.gridy = 0;                            //fila 0
        constraintsLayout.weightx = 0.5;
        constraintsLayout.anchor = GridBagConstraints.LINE_START;
        getContentPane().add(panelAgregar, constraintsLayout);
        constraintsLayout.fill = GridBagConstraints.HORIZONTAL; // crecimiento horizontal
        constraintsLayout.gridx = 0;                            // columna 0
        constraintsLayout.gridy = 1;                            //fila 1
        constraintsLayout.ipady = 200;
        constraintsLayout.weightx = 0.5;
        constraintsLayout.anchor = GridBagConstraints.LAST_LINE_START;
        getContentPane().add(panelMostrar, constraintsLayout);
    }

    //Metodo para lanzar la ventana, se requiere relacionar la vista con el controlador de la ventana, en este caso
    //ControladorCRUD
    public void renderizar(ControladorCRUD controladorCRUD){
        this.setVisible(true);
        btnAgregar.addActionListener(controladorCRUD);
        btnMostrar.addActionListener(controladorCRUD);
                
    }
    public void showMensaje(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
    public void showMensajeError(String msg, Exception ex){
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Suma MVC-GUI", JOptionPane.ERROR_MESSAGE);
    }
    //Métodos GET para obtener los campos de los JTxtField
    public String getNombre(){
        return this.fieldNombre.getText();
    }
    public String getEdad(){
        return this.fieldEdad.getText();
    }

    public void setRegistroPersonas(String[][] registros){
        //se deberia 
    }
}
