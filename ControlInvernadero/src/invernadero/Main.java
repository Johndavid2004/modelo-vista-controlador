package invernadero;

public class Main {
    public static void main(String[] args) {
        Invernadero invernadero = new Invernadero();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(invernadero, vista);

        controlador.ejecutar();
    }
}
