// Archivo: Ejercicio11.java
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            if (edad < 0) {
                System.out.println("Error: La edad no puede ser negativa.");
            } else if (edad <= 12) {
                System.out.println("Clasificación: Niño");
            } else if (edad <= 17) {
                System.out.println("Clasificación: Adolescente");
            } else {
                System.out.println("Clasificación: Adulto");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un entero válido.");
        } finally {
            scanner.close();
        }
    }
}