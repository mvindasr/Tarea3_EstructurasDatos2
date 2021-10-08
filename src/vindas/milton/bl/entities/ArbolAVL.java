package vindas.milton.bl.entities;

public class ArbolAVL {
    /**
     * El nodo raíz del árbol
     */
    Nodo raiz;

    /**
     * Constructor por defecto de la clase
     */
    public ArbolAVL() {
        this.raiz = null;
    }


    /*-------------------------------------------------------------------------------------
                                         Métodos Públicos
    --------------------------------------------------------------------------------------*/
    /**
     * Método que retorna el nodo raíz
     * @return Retorna el nodo raíz
     */
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     * Método que establece el nodo raíz del árbol
     * @param raiz El nodo a ser establecido como raíz
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    /**
     * Método público para agregar dato al árbol binario
     * @param pDato El entero que representa el dato por agregarse
     */
    public void agregar(int pDato) {
        raiz = agregarRecursivo(raiz, pDato);
    }

    /**
     * Método público que retorna los elementos del árbol según el tipo de orden determinado.
     * @param orden El entero con el tipo de orden (1. PreOrden, 2. InOrden, 3. PostOrden)
     * @return Retorna el String con el contenido del árbol en el orden seleccionado.
     */
    public String mostrarArbol(int orden) {
        String result = "";
        switch (orden) {
            case 1:
                result= result + mostrarPreOrden(getRaiz());
                break;
            case 2:
                result= result + mostrarInOrden(getRaiz());
                break;
            case 3:
                result= result + mostrarPostOrden(getRaiz());
                break;
            default:
                result = "Opción incorrecta.";
        }
        return result;
    }


    /*-------------------------------------------------------------------------------------
                                         Métodos Privados
    --------------------------------------------------------------------------------------*/

    private int factorEq(Nodo actual)
    {
        return actual == null ? -1 : actual.factorEq;
    }

    /**
     * Método privado recursivo que administra la posición del nuevo nodo en el árbol
     * @param actual El nodo raíz
     * @param pDato El entero por agregarse
     * @return Retorna el nodo que se establece como raíz.
     */
    private Nodo agregarRecursivo(Nodo actual, int pDato) {
            if (actual == null)
                actual = new Nodo(pDato);
            else if (pDato < actual.dato)
            {
                actual.izq = agregarRecursivo(actual.izq, pDato);
                if( factorEq(actual.izq) - factorEq(actual.der) == 2)
                    if( pDato < actual.izq.dato)
                        actual = rotacionSimpleIzquierda(actual);
                    else
                        t = doubleWithLeftChild( t );
            }
            else if( x > t.data )
            {
                t.right = insert( x, t.right );
                if( height( t.right ) - height( t.left ) == 2 )
                    if( x > t.right.data)
                        t = rotateWithRightChild( t );
                    else
                        t = doubleWithRightChild( t );
            }
            else
                ;  // Duplicate; do nothing
            t.height = max( height( t.left ), height( t.right ) ) + 1;
            return t;
        }

    /**
     * ROTACION SIMPLE A LA IZQUIERDA
     */
    private Nodo rotacionSimpleIzquierda(Nodo actual) {

    }


    /**
     * ROTACION SIMPLE A LA DERECHA
     */

    /**
     * ROTACION DOBLE A LA IZQUIERDA
     */


    /**
     * ROTACION DOBLE A LA DERECHA
     */


     /*-------------------------------------------------------------------------------------
                            Métodos privados de despliegue
    --------------------------------------------------------------------------------------*/

    /**
     * Método privado que retorna los elementos del árbol según inorden
     * @param nodo El nodo raíz
     */
    private String mostrarInOrden(Nodo nodo) {
        String result = "";
        if (nodo != null) {
            result = result + mostrarInOrden(nodo.getIzq());
            result = result + nodo.getDato() + " ";
            result = result + mostrarInOrden(nodo.getDer());
        }
        return result;
    }

    /**
     * Método privado que retorna los elementos del árbol según preorden
     * @param nodo El nodo raíz
     */
    private String mostrarPreOrden(Nodo nodo) {
        String result = "";
        if (nodo != null) {
            result = result + nodo.getDato() + " ";
            result = result + mostrarPreOrden(nodo.getIzq());
            result = result + mostrarPreOrden(nodo.getDer());
        }
        return result;
    }

    /**
     * Método privado que retorna los elementos del árbol según postorden
     * @param nodo El nodo raíz
     */
    private String mostrarPostOrden(Nodo nodo) {
        String result = "";
        if (nodo != null) {
            result = result + mostrarPostOrden(nodo.getIzq());
            result = result + mostrarPostOrden(nodo.getDer());
            result = result + nodo.getDato() + " ";
        }
        return result;
    }

}
