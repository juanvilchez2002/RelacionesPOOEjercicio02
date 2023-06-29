
package servicio;

import entidad.Revolver;

public class RevolverServicio {
    
    Revolver r = new Revolver();
    
    public Revolver llenarRevolver(){
        //formula para crear aleatorio con rango
        //int numero = (int)(Math.random()*(X-Y+1)+Y;
        Integer pa = (int) (Math.random()*(6-1+1)+1);        
        Integer pd = (int) (Math.random()*(6-1+1)+1);
        
        r.setPosicionactual(pa);
        r.setPosicionagua(pd);
        return r;
    }
    
    public Boolean mojado(){        
        if(r.getPosicionagua()==r.getPosicionactual()){
            return true;
        }        
        return false;        
    }
    
    public void siguienteChoro(){
        //el tambor de un revolver tiene 6 espacios
        if(r.getPosicionactual()== 6){
            r.setPosicionactual(1);
            System.out.println(r.getPosicionactual());
        }else{
            r.setPosicionactual(r.getPosicionactual()+1);
            System.out.println(r.getPosicionactual());
        }
    }

    @Override
    public String toString() {
        return "RevolverServicio{" + "r=" + r.toString() + '}';
    }
    
    
}
