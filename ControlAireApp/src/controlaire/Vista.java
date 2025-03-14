package controlaire;

import java.util.Scanner;

public class Vista {
    private final Scanner entrada = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Menú del Sistema de Aire Acondicionado ===");
        System.out.println("1. Simular lectura de sensores");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
        return entrada.nextInt();
    }

    public void mostrarEstado(double temperatura, double humedad, boolean aireEncendido) {
        System.out.println("\nEstado del sistema de aire acondicionado:");
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Humedad: " + humedad + "%");
        System.out.println("Aire Acondicionado: " + (aireEncendido ? "ENCENDIDO ❄️" : "APAGADO 🔥"));
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarEntrada() {
        entrada.close();
    }
}
