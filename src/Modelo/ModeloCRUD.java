package Modelo;
import Modelo.*;

public class ModeloCRUD {
    //Modelos 
    private final ListadoPersonas modeloListadoPersonas;
    private final AgregarPersona modeloAgregarPersona;
    public ModeloCRUD(){
        modeloAgregarPersona = new AgregarPersona();
        modeloListadoPersonas = new ListadoPersonas();
    }
    public AgregarPersona getAgregarPersonaM(){
        return modeloAgregarPersona;
    }
    public ListadoPersonas getListadoPersonasM(){
        return modeloListadoPersonas;
    }
}
