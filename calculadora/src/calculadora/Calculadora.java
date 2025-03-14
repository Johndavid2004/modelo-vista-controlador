package calculadora;

public class Calculadora {
    // Método para realizar operaciones matemáticas básicas
    public double operar(double num1, double num2, char operacion) {
        return switch (operacion) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (num2 != 0) ? num1 / num2 : Double.NaN;
            default -> Double.NaN; // Retorna NaN si la operación no es válida
        };
    }
}
