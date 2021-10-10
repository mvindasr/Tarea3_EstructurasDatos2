package vindas.milton.tl;

import vindas.milton.bl.logic.Gestor;
import vindas.milton.ui.UI;

import java.io.IOException;

public class Controller {
    private UI interfaz;
    private Gestor localGestor;

    public Controller() {
        interfaz = new UI();
        localGestor = new Gestor();
    }

    public void iniciar() throws Exception {

        int opcion;

        interfaz.imprimirMensaje("*****Bienvenido al programa de Estructuras de Datos 2 - Tarea 3: Árbol AVL*****");

        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        }
        while (opcion != 3);

    }

    public void procesarOpcion(int pOpcion) throws Exception {
        switch (pOpcion) {
            case 1:
                agregarNumero();
                break;
            case 2:
                mostrarArbol();
                break;
            case 3:
                interfaz.imprimirMensaje("Usted ha seleccionado salir del sistema.");
                break;
            default:
                interfaz.imprimirMensaje("Opción incorrecta.");
                break;
        }
        interfaz.imprimirMensaje("Presione enter para continuar...");
        interfaz.leerTexto();
    }

    public void agregarNumero() throws IOException {
        int num;
        interfaz.imprimirMensaje("Digite el número que desea agregar al árbol AVL: ");
        num = interfaz.leerOpcion();
        interfaz.imprimirMensaje(localGestor.agregarAArbol(num));
    }

    public void mostrarArbol() throws IOException {
        int orden;
        interfaz.imprimirMensaje("Digite el tipo de orden para desplegar el árbol: 1. Preorden, 2. Inorden, 3. Postorden ");
        orden = interfaz.leerOpcion();
        interfaz.imprimirMensaje(localGestor.mostrarArbol(orden));
    }

}
