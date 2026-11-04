public class HechizoDefensivo extends Hechizo {
    private boolean generaEscudoFisico;

    public HechizoDefensivo(String nombre, String tipo, int nivelDificultad, int poderMagico, int anioAprendizaje, boolean generaEscudoFisico) {
        super(nombre, tipo, nivelDificultad, poderMagico, anioAprendizaje);
        this.generaEscudoFisico = generaEscudoFisico;
    }

    public boolean isGeneraEscudoFisico() { return generaEscudoFisico; }
    public void setGeneraEscudoFisico(boolean generaEscudoFisico) { this.generaEscudoFisico = generaEscudoFisico; }

    @Override
    public void conjurarHechizo() {
        System.out.println("¡Expecto Patronum! El hechizo defensivo " + getNombre() + " protege al mago con luz pura (Escudo físico: " + generaEscudoFisico + ").");
    }
}