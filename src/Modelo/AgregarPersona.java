package Modelo;

public class AgregarPersona {
    private String nombre;
    private int edad;

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    /// caray jajajaj, si se necesitaban los set
    public void setEdad(String edad){
        this.edad = Integer.parseInt(edad);
        //System.out.println(this.edad);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
