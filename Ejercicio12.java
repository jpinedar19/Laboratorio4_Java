// Archivo: Ejercicio12.java
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--- MENÚ BÁSICO ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1 || opcion == 2) {
                System.out.print("Ingrese el primer número: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Ingrese el segundo número: ");
                double b = Double.parseDouble(scanner.nextLine());

                if (opcion == 1) {
                    System.out.println("Resultado de la Suma: " + (a + b));
                } else {
                    System.out.println("Resultado de la Resta: " + (a - b));
                }
            } else {
                System.out.println("Opción no válida.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }
}
