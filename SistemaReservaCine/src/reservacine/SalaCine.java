package reservacine;

import java.util.ArrayList;

public class SalaCine {
    private final boolean[] asientos;
    private final int totalAsientos;
    private final ArrayList<Cliente> clientes;  // Lista dinámica para clientes

    public SalaCine(int totalAsientos) {
        this.totalAsientos = totalAsientos;
        this.asientos = new boolean[totalAsientos];
        this.clientes = new ArrayList<>();
    }

    public boolean asignarAsiento(Cliente cliente, int numero) {
        if (numero >= 0 && numero < totalAsientos && !asientos[numero]) {
            asientos[numero] = true;
            cliente.asignarAsiento(numero);
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    public int contarAsientosLibres() {
        int disponibles = 0;
        for (boolean ocupado : asientos) {
            if (!ocupado) disponibles++;
        }
        return disponibles;
    }

    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("\n--- Lista de Reservas ---");
            for (Cliente c : clientes) {
                System.out.println("Cliente: " + c.obtenerNombre() + " - Asiento: " + c.obtenerAsiento());
            }
        }
    }
}
