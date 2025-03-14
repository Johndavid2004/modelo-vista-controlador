package invernadero;

public class Controlador {
    private final Invernadero invernadero;
    private final Vista vista;

    public Controlador(Invernadero invernadero, Vista vista) {
        this.invernadero = invernadero;
        this.vista = vista;
    }

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    double temperatura = invernadero.obtenerTemperatura();
                    String estado = invernadero.determinarEstado(temperatura);
                    vista.mostrarEstado(temperatura, estado);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        vista.mostrarMensaje("Error en la simulación del sensor.");
                    }
                }
                case 2 -> {
                    vista.mostrarMensaje("Saliendo del sistema de control de temperatura...");
                    vista.cerrarEntrada();
                    continuar = false;
                }
                default -> vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
