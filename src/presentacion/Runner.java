package presentacion;

import logic.AlgoritmoDijkstra;
import logic.Grafo;
import logic.Nodo;

public class Runner {
	 public static void main(String[] args) {
	        Grafo grafo = new Grafo();

	        for (int i = 0; i < 5; i++) {
	            grafo.agregarNodo(new Nodo(i));
	        }

	        grafo.agregarArista(0, 1, 10.0);
	        grafo.agregarArista(0, 2, 5.0);
	        grafo.agregarArista(1, 2, 2.0);
	        grafo.agregarArista(1, 3, 1.0);
	        grafo.agregarArista(2, 3, 4.0);
	        grafo.agregarArista(2, 4, 8.0);
	        grafo.agregarArista(3, 4, 3.0);

	        int idNodoInicio = 0; 
	        AlgoritmoDijkstra.dijkstra(grafo, idNodoInicio);
	        
	        
	    }
}
