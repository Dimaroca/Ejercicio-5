    public class Daemon extends Proceso {
        private String mensaje;

        public Daemon(int pid, String nombre, String accion, String mensaje) {
            super(pid, nombre, accion);
            this.mensaje = mensaje;
        }

        @Override
        public String ejecutar() {
            return getNombre() + mensaje + " [ejecutándose en segundo plano]";
        }
    }
