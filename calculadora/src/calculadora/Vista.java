package calculadora;

import java.util.Scanner;

public class Vista {
    private final Scanner entrada = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Menú de Calculadora ===");
        System.out.println("1. Realizar una operación");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
        return entrada.nextInt();
    }

    public double obtenerNumero(String mensaje) {
        System.out.print(mensaje);
        return entrada.nextDouble();
    }

    public char obtenerOperacion() {
        System.out.print("Ingrese la operación (+, -, *, /): ");
        return entrada.next().charAt(0);
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarEntrada() {
        entrada.close();
    }
}
