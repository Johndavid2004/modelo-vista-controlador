package tienda;

import java.util.Scanner;

public class Vista {
    private final Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Menú de Control de Acceso ===");
        System.out.println("1. Intentar ingresar a la tienda");
        System.out.println("2. Consultar horario de la tienda");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public int solicitarHora() {
        System.out.print("Ingrese la hora actual (0-23): ");
        return scanner.nextInt();
    }

    public boolean solicitarMembresia() {
        System.out.print("¿Tiene membresía? (true/false): ");
        return scanner.nextBoolean();
    }

    public boolean solicitarEmpleado() {
        System.out.print("¿Es empleado? (true/false): ");
        return scanner.nextBoolean();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
