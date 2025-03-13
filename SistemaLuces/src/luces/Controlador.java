package luces;

public class Controlador {
    private final SistemaLuces sistema;
    private final Vista vista;

    public Controlador(SistemaLuces sistema, Vista vista) {
        this.sistema = sistema;
        this.vista = vista;
    }

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    for (int i = 0; i < 3; i++) { 
                        sistema.actualizarEstado();
                        vista.mostrarEstado(sistema.esDeNoche(), sistema.hayMovimiento(), sistema.lucesEncendidas());
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            vista.mostrarMensaje("Error en la simulación.");
                        }
                    }
                }
                case 2 -> {
                    sistema.alternarDiaNoche();
                    vista.mostrarMensaje("Se ha cambiado a " + (sistema.esDeNoche() ? "noche 🌙" : "día ☀️"));
                }
                case 3 -> {
                    vista.mostrarMensaje("Saliendo del sistema de control de luces...");
                    vista.cerrarEntrada();
                    continuar = false;
                }
                default -> vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
