// Archivo: Ejercicio15.java
import java.util.Scanner;

// Clase abstracta base
abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto que cada tipo de empleado implementa a su manera
    public abstract double calcularPago();
}

// Subclase: Empleado a Tiempo Completo
class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}

// Subclase: Empleado por Horas
class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }
}

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--- SISTEMA DE GESTIÓN DE EMPLEADOS ---");
            
            // Datos para Empleado Tiempo Completo
            System.out.print("Ingrese nombre del empleado a tiempo completo: ");
            String nom1 = scanner.nextLine();
            
            System.out.print("Ingrese el salario mensual: ");
            double salario = Double.parseDouble(scanner.nextLine());

            if (salario <= 0) {
                throw new IllegalArgumentException("El salario mensual debe ser un número positivo mayor a cero.");
            }

            // Datos para Empleado por Horas
            System.out.print("\nIngrese nombre del empleado por horas: ");
            String nom2 = scanner.nextLine();

            System.out.print("Ingrese cantidad de horas trabajadas: ");
            int horas = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese tarifa por hora: ");
            double tarifa = Double.parseDouble(scanner.nextLine());

            if (horas < 0 || tarifa <= 0) {
                throw new IllegalArgumentException("Las horas no pueden ser negativas y la tarifa debe ser positiva.");
            }

            // Creación de objetos usando Polimorfismo
            Empleado emp1 = new EmpleadoTiempoCompleto(nom1, salario);
            Empleado emp2 = new EmpleadoPorHoras(nom2, horas, tarifa);

            System.out.println("\n-------------------------------------------");
            System.out.println("--- RESUMEN DE PAGOS Y POLIMORFISMO ---");
            System.out.println("-------------------------------------------");
            
            // Demostración de Polimorfismo llamando a calcularPago()
            mostrarEmpleado(emp1);
            mostrarEmpleado(emp2);

        } catch (NumberFormatException e) {
            System.out.println("\nError de Entrada: Debe ingresar valores numéricos válidos para salarios, horas y tarifas.");
        } catch (IllegalArgumentException e) {
            System.out.println("\nError de Validación: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Método auxiliar que demuestra Polimorfismo al recibir la clase base Empleado
    public static void mostrarEmpleado(Empleado emp) {
        System.out.printf("Empleado: %-15s | Total a Pagar: Q%.2f%n", emp.getNombre(), emp.calcularPago());
    }
}