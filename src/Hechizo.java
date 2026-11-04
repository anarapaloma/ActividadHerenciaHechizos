import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Hechizo {
    private String nombre;
    private String tipo;
    private int nivelDificultad;
    private int poderMagico;
    private int anioAprendizaje;

    int manaRequerido_primitivo = 50;
    Integer manaRequerido_objeto = 50;

    double duracionSegundos_primitivo = 4.5;
    Double duracionSegundos_objeto = 4.5;

    char clasificacionRiesgo_primitivo = 'A';
    Character clasificacionRiesgo_objeto = 'A';

    boolean requiereVarita_primitivo = true;
    Boolean requiereVarita_objeto = true;

    long codigoMagico_primitivo = 987654321L;
    Long codigoMagico_objeto = 987654321L;

    float precisionRequerida_primitiva = 95.5f;
    Float precisionRequerida_objeto = 95.5f;

    byte nivelPeligro_primitivo = 3;
    Byte nivelPeligro_objeto = 3;

    ArrayList<String> ingredientesNecesarios = new ArrayList<>();
    LinkedList<String> historialLanzamientos = new LinkedList<>();
    HashSet<Integer> codigosMagicos = new HashSet<>();
    HashMap<String, String> efectosSecundarios = new HashMap<>();

    public Hechizo() {}

    public Hechizo(String nombre, String tipo, int nivelDificultad, int poderMagico, int anioAprendizaje) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelDificultad = nivelDificultad;
        this.poderMagico = poderMagico;
        this.anioAprendizaje = anioAprendizaje;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getNivelDificultad() { return nivelDificultad; }
    public void setNivelDificultad(int nivelDificultad) { this.nivelDificultad = nivelDificultad; }

    public int getPoderMagico() { return poderMagico; }
    public void setPoderMagico(int poderMagico) { this.poderMagico = poderMagico; }

    public int getAnioAprendizaje() { return anioAprendizaje; }
    public void setAnioAprendizaje(int anioAprendizaje) { this.anioAprendizaje = anioAprendizaje; }

    public void conjurarHechizo() {
        System.out.println("El mago agita su varita y lanza un hechizo genérico.");
    }
}