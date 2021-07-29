package Controlador;

import Controlador.*;
import Modelo.ListadoAgregar;
import Modelo.ListadoPersonas;
import Modelo.ModeloCRUD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Constantes.AccionesBtns;
import Vista.VistaPrincipal;

public class ControladorCRUD implements ActionListener{
    //atribitos del 

    //private final ControladorListadoAgregar listadoAgregarC;
    //private final ControladorListadoPersonas listadoPersonasC; 
    private final ListadoPersonas modeloListPersonas;
    private final ListadoAgregar modeloListAgregar;
    private final VistaPrincipal vistaPrincipal;
    public ControladorCRUD(VistaPrincipal vistaPrin, ModeloCRUD modelo){
        //listadoAgregarC = new ControladorListadoAgregar(modelo.getListadoAgregar())
        //listadoPersonasC = new ControladorListadoPersonas(modelo.getListadoPersonas());
        this.vistaPrincipal = vistaPrin;
        this.modeloListPersonas = modelo.getListadoPersonas();
        this.modeloListAgregar = modelo.getListadoAgregar();
    }
    public void init(){
        vistaPrincipal.renderizar(this);
    }
    @Override
    public void actionPerformed(ActionEvent event){
        //se evalua que boton ha sido presionado
        switch(event.getActionCommand()){
            case "AGREGAR":
                //le digo al control de la 
                //listadoAgregarC.agregarPersona(vistaPrincipal);

                //1. se pide la info de la ventana y se coloca en el modelo de agregar
                modeloListAgregar.setNombre(vistaPrincipal.getNombre());
                modeloListAgregar.setEdad(vistaPrincipal.getEdad());
                //2. se muestra en pantalla el dato ingresado
                vistaPrincipal.showMensaje("Se ha agregado \n"+"nombre: "+ modeloListAgregar.getNombre()+ "\tedad: " + modeloListAgregar.getEdad());
                //2.Se actualiza la info en la lista
                modeloListPersonas.setPersona(modeloListAgregar.getNombre(), modeloListAgregar.getEdad());
                break;
            case "MOSTRAR":
                vistaPrincipal.showMensaje(modeloListPersonas.mostrarRegistros());
                break;
        }


        
    }    

}