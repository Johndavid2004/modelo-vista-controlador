package tienda;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(9, 21);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(tienda, vista);

        controlador.ejecutar();
    }
}
