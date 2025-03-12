package reservacine;

public class Controlador {
    private final SalaCine sala;
    private final Vista vista;

    public Controlador(SalaCine sala, Vista vista) {
        this.sala = sala;
        this.vista = vista;
    }

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    String nombre = vista.solicitarNombre();
                    Cliente cliente = new Cliente(nombre);
                    int numeroAsiento = vista.solicitarAsiento();

                    if (sala.asignarAsiento(cliente, numeroAsiento)) {
                        vista.mostrarMensaje("Reserva confirmada para " + cliente.obtenerNombre() +
                                ". Asiento: " + cliente.obtenerAsiento());
                    } else {
                        vista.mostrarMensaje("El asiento está ocupado o fuera de rango.");
                    }
                }
                case 2 -> vista.mostrarMensaje("Asientos libres: " + sala.contarAsientosLibres());
                case 3 -> sala.mostrarClientes();
                case 4 -> {
                    vista.mostrarMensaje("Cerrando sistema de reservas...");
                    vista.cerrarEntrada();
                    continuar = false;
                }
                default -> vista.mostrarMensaje("Opción inválida, intente nuevamente.");
            }
        }
    }
}
