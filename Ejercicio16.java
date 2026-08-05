// Archivo: Ejercicio16.java
import java.util.Scanner;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarDetalles() {
        System.out.printf("Producto: %-18s | Precio: Q%.2f%n", nombre, precio);
    }
}

class ProductoFisico extends Producto {
    private double pesoKg;

    public ProductoFisico(String nombre, double precio, double pesoKg) {
        super(nombre, precio);
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Físico  -> %-15s | Precio: Q%-7.2f | Peso: %.2f kg%n", 
                          getNombre(), getPrecio(), pesoKg);
    }
}

class ProductoDigital extends Producto {
    private double tamanoMB;

    public ProductoDigital(String nombre, double precio, double tamanoMB) {
        super(nombre, precio);
        this.tamanoMB = tamanoMB;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Digital -> %-15s | Precio: Q%-7.2f | Tamaño: %.2f MB%n", 
                          getNombre(), getPrecio(), tamanoMB);
    }
}

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--- REGISTRO DE PRODUCTOS ---");
            
            // Producto Físico
            System.out.print("Nombre del producto físico: ");
            String nomFisico = scanner.nextLine();
            System.out.print("Precio (Q): ");
            double precioFisico = Double.parseDouble(scanner.nextLine());
            System.out.print("Peso (kg): ");
            double peso = Double.parseDouble(scanner.nextLine());

            // Producto Digital
            System.out.print("\nNombre del producto digital: ");
            String nomDigital = scanner.nextLine();
            System.out.print("Precio (Q): ");
            double precioDigital = Double.parseDouble(scanner.nextLine());
            System.out.print("Tamaño (MB): ");
            double tamano = Double.parseDouble(scanner.nextLine());

            if (precioFisico < 0 || precioDigital < 0 || peso < 0 || tamano < 0) {
                throw new IllegalArgumentException("Los valores de precio, peso y tamaño no pueden ser negativos.");
            }

            // Polimorfismo mediante arreglo de la clase base Producto
            Producto[] catalogo = new Producto[2];
            catalogo[0] = new ProductoFisico(nomFisico, precioFisico, peso);
            catalogo[1] = new ProductoDigital(nomDigital, precioDigital, tamano);

            System.out.println("\n-------------------------------------------------------");
            System.out.println("--- CATÁLOGO DE PRODUCTOS REGISTRADOS ---");
            System.out.println("-------------------------------------------------------");
            for (Producto p : catalogo) {
                p.mostrarDetalles();
            }

        } catch (NumberFormatException e) {
            System.out.println("\nError: Ingrese datos numéricos válidos para precios, pesos o tamaños.");
        } catch (IllegalArgumentException e) {
            System.out.println("\nError de Validación: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}