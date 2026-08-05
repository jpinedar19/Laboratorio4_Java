// Archivo: Ejercicio1.java

abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto que debe ser implementado por las clases hijas
    public abstract void hacerSonido();
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau guau!");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau miau!");
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        // Demostración de polimorfismo mediante un arreglo de la clase base
        Animal[] animales = new Animal[2];
        animales[0] = new Perro("Firulais");
        animales[1] = new Gato("Michi");

        System.out.println("--- SISTEMA DE ANIMALES ---");
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}