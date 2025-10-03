Simulador de Procesos en Java
Descripción

Este proyecto es un simulador de procesos que permite crear y ejecutar distintos tipos de procesos como CPU, Entrada/Salida y Daemon.
El simulador se centra en la programación orientada a objetos, usando herencia, polimorfismo y clases abstractas.

Estructura del proyecto
Clases principales

Proceso (abstracta)

Atributos: pid, nombre, accion.

Métodos:

ejecutar(): abstracto, implementado por las subclases.

Getters para todos los atributos.

toString(): representación legible del proceso.

CPU

Hereda de Proceso.

Atributos: inicio, end.

Método ejecutar(): retorna la operación y su resultado.

EntradaSalida

Hereda de Proceso.

Atributos: entrada, salida.

Método ejecutar(): retorna la entrada y salida simulada.

Daemon

Hereda de Proceso.

Atributo: mensaje.

Método ejecutar(): retorna el mensaje indicando que se ejecuta en segundo plano.

Controlador

Atributo: procesos (ArrayList de Proceso).

Método registrarProceso(): agrega un proceso al controlador.

Main

Interfaz de usuario por consola.

Permite:

Crear procesos.

Ejecutar procesos.

Salir del programa.

Funcionalidades

Crear procesos de tipo:

CPU

Entrada/Salida

Daemon

Listar todos los procesos registrados.

Ejecutar un proceso específico por su PID.

Uso de polimorfismo: todos los procesos son tratados como objetos Proceso.

Requisitos

Java JDK 8 o superior.

IDE recomendado: IntelliJ IDEA, Eclipse o NetBeans.

Cómo ejecutar

Clonar o descargar el proyecto.

Compilar todas las clases:

javac *.java


Ejecutar el programa principal:

java Main


Usar el menú para crear y ejecutar procesos.

Ejemplo de ejecución
--- SIMULADOR DE PROCESOS ---
1. Crear proceso CPU
2. Crear proceso Entrada/Salida
3. Crear proceso Daemon
4. Ejecutar procesos
5. Salir
Elige una opción: 1

Nombre del proceso CPU: Suma
Nombre la accion de su proceso: Calcular
Ingrese la operacion: 5 + 3
Ingrese el resultado: 8

--- SIMULADOR DE PROCESOS ---
1. Crear proceso CPU
...
4. Ejecutar procesos
Elige el proceso a ejecutar: 1
Salida: 5 + 3 = 8
