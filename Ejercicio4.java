// Archivo: Ejercicio4.java

class Material {
    private String titulo;
    private String autor;

    public Material(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + " | Autor: " + autor);
    }
}

class Libro extends Material {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro   -> Título: " + getTitulo() + " | Autor: " + getAutor() + " | Páginas: " + numeroPaginas);
    }
}

class Revista extends Material {
    private int edicion;

    public Revista(String titulo, String autor, int edicion) {
        super(titulo, autor);
        this.edicion = edicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista -> Título: " + getTitulo() + " | Autor: " + getAutor() + " | Edición N°: " + edicion);
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Material libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
        Material revista = new Revista("National Geographic", "Varios", 205);

        System.out.println("--- SISTEMA DE BIBLIOTECA ---");
        libro.mostrarInformacion();
        revista.mostrarInformacion();
    }
}