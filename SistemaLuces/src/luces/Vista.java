package luces;

import java.util.Scanner;

public class Vista {
    private final Scanner entrada = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Menú del Sistema de Luces ===");
        System.out.println("1. Simular sistema de luces (actualización cada 10 segundos)");
        System.out.println("2. Alternar entre día y noche");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return entrada.nextInt();
    }

    public void mostrarEstado(boolean esDeNoche, boolean hayMovimiento, boolean lucesEncendidas) {
        System.out.println("\nEstado del sistema de luces:");
        System.out.println("Es de noche: " + (esDeNoche ? "Sí 🌙" : "No ☀️"));
        System.out.println("Movimiento detectado: " + (hayMovimiento ? "Sí 🚶" : "No ❌"));
        System.out.println("Luces: " + (lucesEncendidas ? "ENCENDIDAS 💡" : "APAGADAS 🌑"));
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarEntrada() {
        entrada.close();
    }
}

