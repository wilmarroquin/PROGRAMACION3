package arbolgrafico;

import java.util.ArrayList;
import javax.swing.JPanel;

public class SimuladorArbolBinario {

    ArboldeExpresiones miArbol = new ArboldeExpresiones();

    public SimuladorArbolBinario() {
    }

    public boolean insertar(String dato) {
        return miArbol.contruir(dato);
    }

    public String borrar(Integer dato) {
        return "No existe el dato en el árbol";
    }

    public String preOrden() {
        return "PreOrden no implementado aún";
    }

    public String inOrden() {
        return "InOrden no implementado aún";
    }

    public String posOrden() {
        return "PosOrden no implementado aún";
    }

    public String imprimirPorNiveles() {
        return "Impresión por niveles no implementada";
    }

    public String obtenerHojas() {
        return "Obtención de hojas no implementada";
    }

    public String obtenerPadre(Integer hijo) {
        return "Búsqueda de padre no implementada";
    }

    public String esta(Integer dato) {
        return "Búsqueda no implementada";
    }

    private String recorrido(ArrayList<?> elementos, String mensaje) {
        StringBuilder resultado = new StringBuilder(mensaje + "\n");
        for (Object elemento : elementos) {
            resultado.append("\t").append(elemento).append("\n");
        }
        return resultado.toString();
    }

    public String cantidadNodos() {
        return "Cantidad de nodos no implementada";
    }

    public String cantidadHojas() {
        return "Cantidad de hojas no implementada";
    }

    public String alturaArbol() {
        return "Altura del árbol no implementada";
    }

    public String menorValor() {
        return "Búsqueda de menor valor no implementada";
    }

    public String mayorValor() {
        return "Búsqueda de mayor valor no implementada";
    }

    public String balance() {
        return "Balance del árbol no implementado";
    }

    public String borrarMenor() {
        return "Borrado del menor no implementado";
    }

    public String borrarMayor() {
        return "Borrado del mayor no implementado";
    }

    public String porNivel() {
        return "Impresión por nivel no implementada";
    }

    public String cambiar() {
        return "Cambio de nodos no implementado";
    }

    public String ramaMayor() {
        return "Rama con más valores no implementada";
    }

    public void podarArbol() {
        // Podado no implementado
    }

    public JPanel getDibujo() {
        return miArbol.getdibujo();
    }
}