package vindas.milton.ui;


public class UI extends ApplicationUI {

    @Override
    public void mostrarMenu() {
        out.println("╔═════════════════════════════╗");
        out.println("       Menú de opciones");
        out.println("╚═════════════════════════════╝");
        out.println("1. Agregar número a árbol AVL.");
        out.println("2. Mostrar números del árbol AVL.");
        out.println("3. Salir.");
        out.println("Digite la opción: ");
    }
}

