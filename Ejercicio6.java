// Archivo: Ejercicio6.java
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número (dividendo): ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese el segundo número (divisor): ");
            double num2 = Double.parseDouble(scanner.nextLine());

            if (num2 == 0) {
                throw new ArithmeticException("No se puede dividir entre cero.");
            }

            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un valor numérico válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}