package controlaire;

public class ControlAire {
    public static void main(String[] args) {
        SistemaAireAcondicionado sistema = new SistemaAireAcondicionado();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(sistema, vista);

        controlador.ejecutar();
    }
}
