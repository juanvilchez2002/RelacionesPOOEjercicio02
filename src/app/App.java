
package app;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.JuegoServicio;
import servicio.JugadorServicio;
import servicio.RevolverServicio;


public class App {

    
    public static void main(String[] args) {
        
        RevolverServicio rs = new RevolverServicio();
        JugadorServicio js = new JugadorServicio();
        JuegoServicio jss = new JuegoServicio();
        
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("--- Inicializando Juego ---\n");
        
        System.out.print("Cantidad de Jugadores(1 a 6): ");
        Integer nj = consola.nextInt();
        if(nj<1 || nj>6){
            System.out.println("Cantidad equivocada, se asigna 6 jugadores");
            nj=6;
        }
        
        //creamos el arraylist de jugadores
        ArrayList<Jugador> jd = new ArrayList();        
        for(int i=1; i<=nj; i++){
            jd.add(new Jugador(i, "Jugador ".concat(Integer.toString(i)), false));            
        }
        
        //creamos el objeto de referencia a Juego
        jss.llenarJuego(jd, rs.llenarRevolver());
        
        System.out.println(rs.toString());
        
        
        System.out.println("");
        System.out.println("Jugadores de la Ruleta\n");
        for(Jugador jj: jd){
            System.out.println(jj.getNombre());
        }
        
        System.out.println("Juego inicializado\n");
        
        jss.ronda(js, rs);
                
    }
    
}
