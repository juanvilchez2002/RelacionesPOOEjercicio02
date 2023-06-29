package entidad;


import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugador;
    private Revolver resolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugador, Revolver resolver) {
        this.jugador = jugador;
        this.resolver = resolver;
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public Revolver getResolver() {
        return resolver;
    }

    public void setResolver(Revolver resolver) {
        this.resolver = resolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador.toString() + ", resolver=" + resolver + '}';
    }
    
    
}
