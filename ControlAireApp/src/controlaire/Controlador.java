package controlaire;

public class Controlador {
    private final SistemaAireAcondicionado sistema;
    private final Vista vista;

    public Controlador(SistemaAireAcondicionado sistema, Vista vista) {
        this.sistema = sistema;
        this.vista = vista;
    }

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    sistema.actualizarEstado();
                    vista.mostrarEstado(sistema.getTemperatura(), sistema.getHumedad(), sistema.isAireEncendido());
                    try {
                        Thread.sleep(5000); 
                    } catch (InterruptedException e) {
                        vista.mostrarMensaje("Error en la simulación.");
                    }
                }
                case 2 -> {
                    vista.mostrarMensaje("Saliendo del sistema de control de aire acondicionado...");
                    vista.cerrarEntrada();
                    continuar = false;
                }
                default -> vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
