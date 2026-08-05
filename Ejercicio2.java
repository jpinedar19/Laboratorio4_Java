// Archivo: Ejercicio2.java

class Vehiculo {
    // Encapsulamiento de atributos
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters para acceder a los atributos privados
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método que será sobrescrito en las clases hijas (Polimorfismo)
    public void mostrarDatos() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}

// Herencia: Carro extiende de Vehiculo
class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Carro -> Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Puertas: " + numeroPuertas);
    }
}

// Herencia: Moto extiende de Vehiculo
class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Moto  -> Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Cilindrada: " + cilindrada + "cc");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        // Demostración de polimorfismo instanciando objetos a través de la clase base
        Vehiculo miCarro = new Carro("Toyota", "Corolla", 4);
        Vehiculo miMoto = new Moto("Yamaha", "MT-07", 689);

        System.out.println("--- SISTEMA DE VEHÍCULOS ---");
        miCarro.mostrarDatos();
        miMoto.mostrarDatos();
    }
}