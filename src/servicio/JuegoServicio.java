
package servicio;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;


public class JuegoServicio {
    
    //creamos las instancias
//    RevolverServicio rs = new RevolverServicio();
//    JugadorServicio js = new JugadorServicio();
    
    Juego j = new Juego();
    //Revolver r;
    
    public void llenarJuego(ArrayList<Jugador> jugador, Revolver r){
        j.setJugador(jugador);
        j.setResolver(r);
    }
    
    public void ronda(JugadorServicio js, RevolverServicio rs){
        boolean flag = true;
        do{
            for(Jugador ju: j.getJugador()){
                System.out.println("Turno de: "+ju.getNombre());
                js.disparo(rs, ju);
                if(ju.getMojado()){
                    System.out.println("Finalizo el Juego");
                    System.out.println("Se mojo "+ju.getNombre());
                    flag=false;
                    break;
                }else{
                    System.out.println("siguinte turno");
                }
                
            }
            
        }while(flag);
    }
}
