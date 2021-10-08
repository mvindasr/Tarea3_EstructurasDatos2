package vindas.milton.dl;

import vindas.milton.bl.entities.ArbolAVL;

public class Data {
    private ArbolAVL arbolBinario;

    public Data() {
        this.arbolBinario = new ArbolAVL();
    }

    public void agregarAArbol(int pDato) {
        arbolBinario.agregar(pDato);
    }

    public String mostrarArbol(int orden) {
        return arbolBinario.mostrarArbol(orden);
    }
}
