package reservacine;

import java.util.Scanner;

public class Vista {
    private final Scanner entrada = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Gestión de Reservas de Cine ===");
        System.out.println("1. Hacer una reserva");
        System.out.println("2. Ver disponibilidad de asientos");
        System.out.println("3. Mostrar reservas");
        System.out.println("4. Salir del sistema");
        System.out.print("Seleccione una opción: ");
        return entrada.nextInt();
    }

    public String solicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        return entrada.next();
    }

    public int solicitarAsiento() {
        System.out.print("Seleccione el número de asiento (0-9): ");
        return entrada.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarEntrada() {
        entrada.close();
    }
}
