// Archivo: Ejercicio7.java
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Por favor, ingrese un número: ");
            double numero = Double.parseDouble(scanner.nextLine());
            System.out.println("¡Número capturado con éxito!: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error de Entrada: El valor ingresado contiene letras o caracteres no válidos.");
        } finally {
            scanner.close();
        }
    }
}