package seguridad;

public class Main {
    public static void main(String[] args) {
        SistemaSeguridad sistema = new SistemaSeguridad();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(sistema, vista);

        controlador.ejecutar();
    }
}
