package reservacine;

public class Cliente {
    private final String nombre;
    private int asientoAsignado;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.asientoAsignado = -1;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerAsiento() {
        return asientoAsignado;
    }

    public void asignarAsiento(int asiento) {
        this.asientoAsignado = asiento;
    }
}
