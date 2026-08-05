// Archivo: Ejercicio9.java
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double n1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese el segundo número: ");
            double n2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese el tercer número: ");
            double n3 = Double.parseDouble(scanner.nextLine());

            double mayor = n1;
            if (n2 > mayor) mayor = n2;
            if (n3 > mayor) mayor = n3;

            System.out.println("El número mayor es: " + mayor);

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese solo números válidos.");
        } finally {
            scanner.close();
        }
    }
}