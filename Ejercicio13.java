// Archivo: Ejercicio13.java
import java.util.ArrayList;
import java.util.List;

class Persona {
    private String nombre;
    private String id;

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}

class Curso {
    private String codigo;
    private String nombreCurso;

    public Curso(String codigo, String nombreCurso) {
        this.codigo = codigo;
        this.nombreCurso = nombreCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
}

class Estudiante extends Persona {
    private String carnet;
    private List<Curso> cursos;

    public Estudiante(String nombre, String id, String carnet) {
        super(nombre, id);
        this.carnet = carnet;
        this.cursos = new ArrayList<>();
    }

    public String getCarnet() {
        return carnet;
    }

    public void inscribirCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso [" + curso.getCodigo() + "] " + curso.getNombreCurso() + 
                           " inscrito al estudiante " + getNombre() + " (Carnet: " + carnet + ", DPI/ID: " + getId() + ")");
    }
}

public class Ejercicio13 {
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Carlos", "101000", "2026-001");
        Curso curso1 = new Curso("PRG1", "Programación I");
        
        System.out.println("--- DIAGRAMA DE CLASES DEMO ---");
        est.inscribirCurso(curso1);
    }
}