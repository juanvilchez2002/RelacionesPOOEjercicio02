
package servicio;

import entidad.Jugador;


public class JugadorServicio {
    //creamos una instancia 
    //RevolverServicio rs = new RevolverServicio();
    public void disparo(RevolverServicio rs, Jugador jugador){
        jugador.setMojado(rs.mojado());
        rs.siguienteChoro();;
    }
}
