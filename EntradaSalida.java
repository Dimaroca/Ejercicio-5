public class EntradaSalida extends Proceso {
    private String entrada;
    private String salida;

    public EntradaSalida(int pid, String nombre, String accion, String entrada, String salida) {
        super(pid, nombre, accion);
        this.entrada = entrada;
        this.salida = salida;
    }

    @Override
    public String ejecutar() {
        return "Entrada: " + entrada + " Salida: " + salida;
    }
}
