public class HechizoEncantamiento extends Hechizo {
    private boolean levitaObjetos;

    public HechizoEncantamiento(String nombre, String tipo, int nivelDificultad, int poderMagico, int anioAprendizaje, boolean levitaObjetos) {
        super(nombre, tipo, nivelDificultad, poderMagico, anioAprendizaje);
        this.levitaObjetos = levitaObjetos;
    }

    public boolean isLevitaObjetos() { return levitaObjetos; }
    public void setLevitaObjetos(boolean levitaObjetos) { this.levitaObjetos = levitaObjetos; }

    @Override
    public void conjurarHechizo() {
        System.out.println("¡Wingardium Leviosa! El encantamiento " + getNombre() + " altera la gravedad (¿Levita objetos?: " + levitaObjetos + ").");
    }
}
