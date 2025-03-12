package fizzbuzz;

public class FizzBuzz {
    // Método para evaluar cada número y devolver el resultado correspondiente
    public String procesarNumero(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(numero);
        }
    }

    public void jugar() {
        System.out.println("\n=== Juego FizzBuzz ===");
        for (int i = 1; i <= 100; i++) {
            System.out.println(procesarNumero(i));
        }
    }
}
