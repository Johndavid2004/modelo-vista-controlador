package seguridad;

import java.util.Scanner;

public class Vista {
    private final Scanner entrada = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Menú del Sistema de Seguridad ===");
        System.out.println("1. Simular detección de movimiento");
        System.out.println("2. Alternar entre día y noche");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return entrada.nextInt();
    }

    public void mostrarEstado(boolean sensor1, boolean sensor2, boolean sensor3, boolean esDeNoche, boolean alarmaActivada) {
        System.out.println("\nEstado del sistema de seguridad:");
        System.out.println("Sensor 1: " + (sensor1 ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Sensor 2: " + (sensor2 ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Sensor 3: " + (sensor3 ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Periodo: " + (esDeNoche ? "Noche 🌙" : "Día ☀️"));
        System.out.println("Alarma: " + (alarmaActivada ? "ACTIVADA 🚨" : "Desactivada ✅"));
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarEntrada() {
        entrada.close();
    }
}
