// Archivo: Ejercicio10.java
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        try {
            System.out.println("--- ESTADÍSTICAS BÁSICAS ---");
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = Double.parseDouble(scanner.nextLine());
            }

            double suma = 0;
            double mayor = numeros[0];
            double menor = numeros[0];

            for (double num : numeros) {
                suma += num;
                if (num > mayor) mayor = num;
                if (num < menor) menor = num;
            }

            double promedio = suma / numeros.length;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio:   " + promedio);
            System.out.println("Número Mayor: " + mayor);
            System.out.println("Número Menor: " + menor);

        } catch (NumberFormatException e) {
            System.out.println("Error: Asegúrese de ingresar solo datos numéricos.");
        } finally {
            scanner.close();
        }
    }
}