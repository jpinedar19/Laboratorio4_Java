// Archivo: Ejercicio8.java
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;

        System.out.println("--- CÁLCULO DE PROMEDIO DE NOTAS ---");
        try {
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                notas[i] = Double.parseDouble(scanner.nextLine());
                suma += notas[i];
            }

            double promedio = suma / notas.length;
            System.out.printf("El promedio de las 5 notas es: %.2f%n", promedio);

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese valores numéricos válidos para las notas.");
        } finally {
            scanner.close();
        }
    }
}