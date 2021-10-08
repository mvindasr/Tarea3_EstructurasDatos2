package vindas.milton.bl.logic;

import vindas.milton.dl.Data;

public class Gestor {
    private Data db = new Data();

    public String agregarAArbol(int pDato) {
        db.agregarAArbol(pDato);
        return "Se agregó el número " + pDato + " al árbol binario.";
    }

    public String mostrarArbol(int pOrden) {
        return db.mostrarArbol(pOrden);
    }

}
