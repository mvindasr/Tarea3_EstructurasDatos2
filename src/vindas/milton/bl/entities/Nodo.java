package vindas.milton.bl.entities;

public class Nodo {
    int dato;
    Nodo izq;
    Nodo der;
    int factorEq;

    public Nodo() {
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
        this.factorEq = 0;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public int getAltura() {
        return factorEq;
    }

    public void setAltura(int factorEq) {
        this.factorEq = factorEq;
    }
}
