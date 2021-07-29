package Controlador;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import Modelo.AgregarPersona;
import Vista.VistaPrincipal;
/** NO usado*/
public class ControladorAgregarPersona{
    //Atributos
    private AgregarPersona listAgregar;

    public ControladorAgregarPersona(AgregarPersona listadoAgregar){
        listAgregar = listadoAgregar;
    }
    public void agregarPersona(VistaPrincipal vista){
        listAgregar.setNombre(vista.getNombre());
        listAgregar.setEdad(vista.getEdad());
    }
}
