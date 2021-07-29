package Controlador;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import Modelo.ListadoAgregar;
import Vista.VistaPrincipal;
public class ControladorListadoAgregar{
    //Atributos
    private ListadoAgregar listAgregar;

    public ControladorListadoAgregar(ListadoAgregar listadoAgregar){
        listAgregar = listadoAgregar;
    }
    public void agregarPersona(VistaPrincipal vista){
        listAgregar.setNombre(vista.getNombre());
        listAgregar.setEdad(vista.getEdad());
    }
}
