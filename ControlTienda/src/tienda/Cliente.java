package tienda;

public class Cliente {
    private final boolean tieneMembresia;
    private final boolean esEmpleado;

    public Cliente(boolean tieneMembresia, boolean esEmpleado) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
    }

    public boolean tieneMembresia() {
        return tieneMembresia;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }
}
