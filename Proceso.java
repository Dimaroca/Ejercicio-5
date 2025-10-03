public abstract class Proceso {
    private int pid;
    private String nombre;
    private String accion;

    public Proceso(int pid, String nombre, String accion){
        this.pid = pid;
        this.nombre = nombre;
        this.accion=accion;
    }

    public int getPid() {
        return pid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAccion() {
        return accion;
    }

    public abstract String ejecutar();

    @Override
    public String toString() {
        return "PID: " + pid + ", Nombre: " + nombre + ", Accion: " + accion;
    }
}
