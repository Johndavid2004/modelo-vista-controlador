package calculadora;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(calculadora, vista);

        controlador.ejecutar();
    }
}
