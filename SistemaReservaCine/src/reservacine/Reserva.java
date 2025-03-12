package reservacine;

public class Reserva {
    public static void main(String[] args) {
        SalaCine sala = new SalaCine(10);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(sala, vista);

        controlador.ejecutar();
    }
}
