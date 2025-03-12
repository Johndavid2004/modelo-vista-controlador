package fizzbuzz;

import java.util.Scanner;

public class Vista {
    private final Scanner entrada = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Menú Principal ===");
        System.out.println("1. Jugar FizzBuzz");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
        return entrada.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarEntrada() {
        entrada.close();
    }
}
