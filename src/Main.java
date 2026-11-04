public class Main {
    public static void main(String[] args) {
        Hechizo h1 = new HechizoDefensivo("Expecto Patronum", "Defensa", 8, 95, 3, true);
        Hechizo h2 = new HechizoOfensivo("Expelliarmus", "Ofensiva", 3, 60, 1, true);
        Hechizo h3 = new HechizoEncantamiento("Wingardium Leviosa", "Encantamiento", 2, 40, 1, true);

        Hechizo[] grimorio = {h1, h2, h3};

        System.out.println("=== GRIMORIO DE HOGWARTS (DEMOSTRACIÓN DE POLIMORFISMO) ===");
        for (int i = 0; i < grimorio.length; i++) {
            System.out.print("Hechizo " + (i + 1) + " -> ");
            grimorio[i].conjurarHechizo();
        }

        h1.setNombre("Expecto Patronum Avanzado");
        System.out.println("\n--- ENCAPSULAMIENTO ---");
        System.out.println("Nombre del hechizo actualizado (vía Getter): " + h1.getNombre());

        h1.ingredientesNecesarios.add("Recuerdo feliz muy potente");
        h1.historialLanzamientos.add("Lanzado en el Bosque Prohibido contra Dementores");
        h1.codigosMagicos.add(777);
        h1.efectosSecundarios.put("Cansancio", "Moderado");

        System.out.println("\n¡Colecciones mágicas inicializadas con éxito en Hogwarts!");
    }
}