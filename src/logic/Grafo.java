package logic;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	List<Nodo> nodos;

    public Grafo() {
        nodos = new ArrayList<>();
    }

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void agregarArista(int idNodoOrigen, int idNodoDestino, double peso) {
        nodos.get(idNodoOrigen).aristas.add(new Arista(idNodoDestino, peso));
        nodos.get(idNodoDestino).aristas.add(new Arista(idNodoOrigen, peso));
    }
}
