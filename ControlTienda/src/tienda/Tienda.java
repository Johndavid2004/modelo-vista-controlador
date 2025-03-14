package tienda;

public class Tienda {
    private final int horaApertura;
    private final int horaCierre;

    public Tienda(int apertura, int cierre) {
        this.horaApertura = apertura;
        this.horaCierre = cierre;
    }

    public boolean estaAbierta(int horaActual) {
        return horaActual >= horaApertura && horaActual <= horaCierre;
    }

    public boolean permitirAcceso(Cliente cliente, int horaActual) {
        return cliente.esEmpleado() || (cliente.tieneMembresia() && estaAbierta(horaActual));
    }

    public String obtenerHorario() {
        return "El horario de la tienda es de " + horaApertura + ":00 a " + horaCierre + ":00.";
    }
}
