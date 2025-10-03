import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controlador controlador = new Controlador();
        int opcion, pid = 1;

        do {
            System.out.println("\n--- SIMULADOR DE PROCESOS ---");
            System.out.println("1. Crear proceso CPU");
            System.out.println("2. Crear proceso Entrada/Salida");
            System.out.println("3. Crear proceso Daemon");
            System.out.println("4. Ejecutar procesos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del proceso CPU: ");
                    String nombrecpu = sc.nextLine();
                    System.out.print("Nombre la accion de su proceso: ");
                    String accioncpu = sc.nextLine();
                    System.out.print("Ingrese la operacion: ");
                    String inicio = sc.nextLine();
                    System.out.print("Ingrese el resultado: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    controlador.registrarProceso(new CPU(pid++, nombrecpu, accioncpu, inicio, end));
                    break;

                case 2:
                    System.out.print("Nombre del proceso: ");
                    String nombrees = sc.nextLine();
                    System.out.print("Nombre la accion de su proceso: ");
                    String acciones = sc.nextLine();
                    System.out.print("Entrada: ");
                    String entrada = sc.nextLine();
                    System.out.print("Salida: ");
                    String salida = sc.nextLine();
                    controlador.registrarProceso(new EntradaSalida(pid++, nombrees, acciones, entrada, salida));
                    break;

                case 3:
                    System.out.print("Nombre del proceso Daemon: ");
                    String nombredaemon = sc.nextLine();
                    System.out.print("Nombre la accion de su proceso: ");
                    String acciondaemon = sc.nextLine();
                    System.out.print("Mensaje que ejecutará en segundo plano: ");
                    String mensaje = sc.nextLine();
                    controlador.registrarProceso(new Daemon(pid++, nombredaemon, acciondaemon, mensaje));
                    break;

                case 4:
                    for(int i=0; i<controlador.procesos.size(); i++){
                        System.out.println(controlador.procesos.get(i).getPid() + ") " + controlador.procesos.get(i).getNombre() + " " + controlador.procesos.get(i).getAccion());
                    }

                    System.out.println("Elige el proceso a ejecutar");
                    int proceso = sc.nextInt();
                    System.out.print(controlador.procesos.get(proceso-1).ejecutar());
                    break;

                case 5:
                    System.out.println("Saliendo del programa");
                    break;
            }
        } while (opcion != 5);

        sc.close();
    }
}
