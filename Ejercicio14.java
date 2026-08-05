// Archivo: Ejercicio14.java

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("--- DIAGRAMA DE SECUENCIA: CONSULTA DE ESTUDIANTE ---");
        System.out.println("1. Usuario -> Consulta informacion enviando ID.");
        System.out.println("2. UI -> Solicita datos al Gestor de Estudiantes.");
        System.out.println("3. Gestor -> Consulta registro en la Base de Datos.");
        System.out.println("4. Base de Datos -> Devuelve registro al Gestor.");
        System.out.println("5. Gestor -> Retorna objeto Estudiante a la UI.");
        System.out.println("6. UI -> Despliega detalles en pantalla al Usuario.");
    }
}