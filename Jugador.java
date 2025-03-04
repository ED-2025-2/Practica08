/**
 * Representa un jugador con un nombre y un número de identificación.
 */
public class Jugador {
    String nombre;
    int numero;

    /**
     * Constructor para crear un nuevo jugador.
     * @param nombre Nombre del jugador
     * @param numero Número de identificación del jugador
     */
    public Jugador(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    /**
     * Para poder visualizar los datos del jugador.
     */
    @Override
    public String toString() {
        return numero + " - " + nombre;
    }
}