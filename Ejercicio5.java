// Archivo: Ejercicio5.java
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser un número negativo.");
            }

            System.out.println("Edad ingresada correctamente: " + edad + " años.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}