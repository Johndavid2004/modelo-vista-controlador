package fizzbuzz;

public class Fizz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(fizzBuzz, vista);

        controlador.ejecutar();
    }
}
