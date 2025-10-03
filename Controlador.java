import java.util.ArrayList;

public class Controlador {
    public ArrayList<Proceso> procesos;

    public Controlador() {
        procesos = new ArrayList<>();
    }

    public void registrarProceso(Proceso p) {
        procesos.add(p);
    }

    
}
