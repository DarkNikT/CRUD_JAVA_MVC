package Modelo;
import Modelo.*;
public class ModeloCRUD {
    //Modelos 
    private final ListadoPersonas modeloListadoPersonas;
    private final ListadoAgregar modeloListadoAgregar;
    public ModeloCRUD(){
        modeloListadoAgregar = new ListadoAgregar();
        modeloListadoPersonas = new ListadoPersonas();
    }
    public ListadoAgregar getListadoAgregar(){
        return modeloListadoAgregar;
    }
    public ListadoPersonas getListadoPersonas(){
        return modeloListadoPersonas;
    }
}
