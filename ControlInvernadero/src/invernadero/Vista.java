package invernadero;

import java.util.Scanner;

public class Vista {
    private final Scanner entrada = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Menú de Control de Invernadero ===");
        System.out.println("1. Leer temperatura y verificar estado");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
        return entrada.nextInt();
    }

    public void mostrarEstado(double temperatura, String estado) {
        System.out.println("\nTemperatura actual: " + temperatura + "°C");
        System.out.println("Estado del sistema: " + estado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarEntrada() {
        entrada.close();
    }
}
