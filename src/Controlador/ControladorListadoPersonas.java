package Controlador;

import Modelo.ListadoPersonas;
/** NO usado*/
public class ControladorListadoPersonas { 
    private ListadoPersonas listPersonas;
    public ControladorListadoPersonas(ListadoPersonas listPersonas){
        this.listPersonas = listPersonas;
    }
    public void agregarPersona(String paramNombre, int paramEdad){
        this.listPersonas.setPersona(paramNombre, paramEdad);
    }
}
