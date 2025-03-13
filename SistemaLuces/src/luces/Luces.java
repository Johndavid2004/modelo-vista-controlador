package luces;

public class Luces {
    public static void main(String[] args) {
        SistemaLuces sistema = new SistemaLuces();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(sistema, vista);

        controlador.ejecutar();
    }
}
