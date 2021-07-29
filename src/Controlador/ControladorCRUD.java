package Controlador;
//Importación paquetes de la solucion
import Constantes.AccionesBtns;
import Vista.VistaPrincipal;
import Controlador.*;
import Modelo.AgregarPersona;
import Modelo.ListadoPersonas;
import Modelo.ModeloCRUD;
//librerias de Java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/** clase para controlar los eventos de la ventana principal*/
public class ControladorCRUD implements ActionListener{
    //atribitos del 
    private final ListadoPersonas modelListadoP;
    private final AgregarPersona modelAgregarP;
    private final VistaPrincipal vistaPrincipal;
    public ControladorCRUD(VistaPrincipal vistaPrin, ModeloCRUD modelo){
        //listadoAgregarC = new ControladorListadoAgregar(modelo.getListadoAgregar())
        //listadoPersonasC = new ControladorListadoPersonas(modelo.getListadoPersonas());
        this.vistaPrincipal = vistaPrin;
        this.modelListadoP = modelo.getListadoPersonasM();
        this.modelAgregarP = modelo.getAgregarPersonaM();
    }
    public void init(){
        vistaPrincipal.renderizar(this);
    }
    @Override
    public void actionPerformed(ActionEvent event){
        try{
            //se evalua que boton ha sido presionado
            switch(event.getActionCommand()){
                case "AGREGAR":
                    //le digo al control de la 
                    //listadoAgregarC.agregarPersona(vistaPrincipal);

                    //1. se pide la info de la ventana y se coloca en el modelo de agregar
                    modelAgregarP.setNombre(vistaPrincipal.getNombre());
                    modelAgregarP.setEdad(vistaPrincipal.getEdad());
                    //2. se muestra en pantalla el dato ingresado
                    vistaPrincipal.showMensaje("Se ha agregado \n"+"nombre: "+ modelAgregarP.getNombre()+ "\tedad: " + modelAgregarP.getEdad());
                    //2.Se actualiza la info en la lista
                    modelListadoP.setPersona(modelAgregarP.getNombre(), modelAgregarP.getEdad());
                    break;
                case "MOSTRAR":
                    vistaPrincipal.showMensaje(modelListadoP.mostrarRegistros());
                    break;
            }

        }catch(Exception ex){
            vistaPrincipal.showMensajeError("", ex);
        }
        

        
    }    

}