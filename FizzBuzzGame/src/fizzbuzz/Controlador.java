package fizzbuzz;

public class Controlador {
    private final FizzBuzz fizzBuzz;
    private final Vista vista;

    public Controlador(FizzBuzz fizzBuzz, Vista vista) {
        this.fizzBuzz = fizzBuzz;
        this.vista = vista;
    }

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> fizzBuzz.jugar();
                case 2 -> {
                    vista.mostrarMensaje("Saliendo del juego...");
                    vista.cerrarEntrada();
                    continuar = false;
                }
                default -> vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
