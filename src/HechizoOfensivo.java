public class HechizoOfensivo extends Hechizo {
    private boolean desarmaOponente;

    public HechizoOfensivo(String nombre, String tipo, int nivelDificultad, int poderMagico, int anioAprendizaje, boolean desarmaOponente) {
        super(nombre, tipo, nivelDificultad, poderMagico, anioAprendizaje);
        this.desarmaOponente = desarmaOponente;
    }

    public boolean isDesarmaOponente() { return desarmaOponente; }
    public void setDesarmaOponente(boolean desarmaOponente) { this.desarmaOponente = desarmaOponente; }

    @Override
    public void conjurarHechizo() {
        System.out.println("¡Expelliarmus! El hechizo ofensivo " + getNombre() + " ataca al rival (¿Desarma al oponente?: " + desarmaOponente + ").");
    }
}
