package entidad;

public class Revolver {
    
    //atributos
    private int posicionActual;
    private int posicionAgua;
    
    //constructor vacio
    public Revolver() {
    }
    
    //constructor con parametros
    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    //setters y getters
    public int getPosicionactual() {
        return posicionActual;
    }

    public void setPosicionactual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionagua() {
        return posicionAgua;
    }

    public void setPosicionagua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionactual=" + posicionActual + ", posicionagua=" + posicionAgua + '}';
    }
    
    
    
}
