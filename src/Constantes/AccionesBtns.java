package Constantes;

public enum AccionesBtns {
    AGREGAR("AGREGAR"), MOSTRAR("MOSTRAR"), ACTUALIZAR("ACTUALIZAR"), ELIMINAR("ELIMINAR");
    private final String action;
    private AccionesBtns(String action){
        this.action = action;
    }
    @Override
    public String toString(){
        return action;
    }
}
