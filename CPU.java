public class CPU extends Proceso {
    private String inicio;
    private int end;

    public CPU(int pid, String nombre, String accion, String inicio, int end) {
        super(pid, nombre, accion);
        this.inicio = inicio;
        this.end = end;
    }

    @Override
    public String ejecutar() {
        return inicio + " = " + end;
    }
}
