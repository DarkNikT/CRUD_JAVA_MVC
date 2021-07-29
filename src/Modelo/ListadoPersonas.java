package Modelo;
import java.util.ArrayList;
// Va a existir el array y metodo para agregar y devolver
public class ListadoPersonas {
    private ArrayList<Integer> registroEdad = new ArrayList<>();
    private ArrayList<String> registroNombre = new ArrayList<>();
    
    public void setPersona(String paramNombre, int paramEdad){
        registroNombre.add(paramNombre);
        registroEdad.add(paramEdad);
    }

    public String mostrarRegistros(){
        String info = "";
        for(int idx = 0; idx < registroEdad.size(); idx++){
            info += registroNombre.get(idx) + ": \t" + registroEdad.get(idx) + "\n";
        }
        return "personas\n"+
            "Nombre \t\t Edad\n"+
            info; 
    }
}
