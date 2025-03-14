package tienda;

public class Controlador {
    private final Tienda tienda;
    private final Vista vista;

    public Controlador(Tienda tienda, Vista vista) {
        this.tienda = tienda;
        this.vista = vista;
    }

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    int horaActual = vista.solicitarHora();
                    boolean tieneMembresia = vista.solicitarMembresia();
                    boolean esEmpleado = vista.solicitarEmpleado();

                    Cliente cliente = new Cliente(tieneMembresia, esEmpleado);

                    if (tienda.permitirAcceso(cliente, horaActual)) {
                        vista.mostrarMensaje("Acceso permitido. Bienvenido a la tienda.");
                    } else {
                        vista.mostrarMensaje("Acceso denegado. No cumple con los requisitos.");
                    }
                }
                case 2 -> vista.mostrarMensaje(tienda.obtenerHorario());
                case 3 -> {
                    vista.mostrarMensaje("Saliendo del sistema de control de acceso...");
                    vista.cerrarScanner();
                    continuar = false;
                }
                default -> vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
