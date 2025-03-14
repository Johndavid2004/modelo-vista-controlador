package calculadora;

public class Controlador {
    private final Calculadora calculadora;
    private final Vista vista;

    public Controlador(Calculadora calculadora, Vista vista) {
        this.calculadora = calculadora;
        this.vista = vista;
    }

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    double num1 = vista.obtenerNumero("Ingrese el primer número: ");
                    double num2 = vista.obtenerNumero("Ingrese el segundo número: ");
                    char operacion = vista.obtenerOperacion();

                    double resultado = calculadora.operar(num1, num2, operacion);
                    vista.mostrarResultado(resultado);
                }
                case 2 -> {
                    vista.mostrarMensaje("Saliendo de la calculadora...");
                    vista.cerrarEntrada();
                    continuar = false;
                }
                default -> vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
