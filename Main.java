/**
 * Método principal para probar la funcionalidad de la clase JuegosDelCalamar.
 */
public class Main {
    public static void main(String[] args) {

        JuegosDelCalamar juego = new JuegosDelCalamar();
        
        //Agregar jugadores
        juego.agregarJugador("Ana");
        juego.agregarJugador("Carlos");
        juego.agregarJugador("Eduardo");
        juego.agregarJugador("Beto");
        juego.agregarJugador("Oscar");

        //Mostrar Lista original
        System.out.println("Lista original:");
        juego.mostrarJugadores();

        //Lista invertida con FOR
        juego.invertirConFor();
        System.out.println("Lista invertida con for:");
        juego.mostrarJugadores();
        
        //Lista invertida con un iterador
        juego.invertirConIterador();
        System.out.println("Lista invertida con iterador:");
        juego.mostrarJugadores();
        
        //Ordenamiento por vocales
        juego.reordenarVocales();
        System.out.println("Lista reordenada (vocales al inicio):");
        juego.mostrarJugadores();

        // Eliminar un jugador por nombre
        juego.eliminarJugador("Carlos");
        System.out.println("Lista después de eliminar a Carlos:");
        juego.mostrarJugadores();
        
        // Eliminar un jugador por número
        juego.eliminarJugador("1");
        System.out.println("Lista después de eliminar al jugador con número 1:");
        juego.mostrarJugadores();
    }
}