package seguridad;

public class Controlador {
    private final SistemaSeguridad sistema;
    private final Vista vista;

    public Controlador(SistemaSeguridad sistema, Vista vista) {
        this.sistema = sistema;
        this.vista = vista;
    }

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    sistema.verificarSensores();
                    vista.mostrarEstado(sistema.getEstadoSensor1(), sistema.getEstadoSensor2(), 
                                        sistema.getEstadoSensor3(), sistema.isEsDeNoche(), sistema.isAlarmaActivada());
                }
                case 2 -> {
                    sistema.alternarDiaNoche();
                    vista.mostrarMensaje("Ahora es " + (sistema.isEsDeNoche() ? "Noche 🌙" : "Día ☀️"));
                }
                case 3 -> {
                    vista.mostrarMensaje("Saliendo del sistema de seguridad...");
                    vista.cerrarEntrada();
                    continuar = false;
                }
                default -> vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

