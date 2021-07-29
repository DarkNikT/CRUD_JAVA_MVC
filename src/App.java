import Controlador.ControladorCRUD;
import Modelo.ModeloCRUD;
import Vista.VistaPrincipal;
public class App {
    public static void main(String[] args) throws Exception {
        
        //instanciar vista y modelo
        VistaPrincipal vista = new VistaPrincipal();
        ModeloCRUD modelo = new ModeloCRUD();
        // intanciar controlador
        ControladorCRUD miControlador = new ControladorCRUD(vista, modelo);
        //lanzar controlador
         miControlador.init();

    }
}


/*
Listado alumnos
Nombre Edad
*/