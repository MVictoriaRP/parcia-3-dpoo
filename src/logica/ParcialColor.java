package logica;

import java.util.Observable;

public class ParcialColor extends Observable {
    private int rojo;
    private int verde;
    private int azul;
    private String tipoFigura;

    public ParcialColor(int rojo, int verde, int azul) {
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    public int getRojo() {
        return rojo;
    }

    public void setRojo(int rojo) {
        this.rojo = rojo;
    }

    public int getVerde() {
        return verde;
    }

    public void setVerde(int verde) {
        this.verde = verde;
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
        this.azul = azul;
    }
    
    public String getFigura() {
        return tipoFigura;
    }

    public void setFigura(String figura) {
        this.tipoFigura = figura;
        notifyObserversChange();
    }

    private void notifyObserversChange() {
        setChanged();
        notifyObservers();
    }
}
