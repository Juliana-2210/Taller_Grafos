package logic;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class AlgoritmoDijkstra {
	public static void dijkstra(Grafo grafo, int idNodoInicio) {
        PriorityQueue<Par> minHeap = new PriorityQueue<>(Comparator.comparingDouble(p -> p.distancia));
        double[] distancias = new double[grafo.nodos.size()];
        Arrays.fill(distancias, Double.POSITIVE_INFINITY);
        distancias[idNodoInicio] = 0;

        minHeap.offer(new Par(idNodoInicio, 0));

        while (!minHeap.isEmpty()) {
            Par actual = minHeap.poll();

            if (actual.distancia > distancias[actual.idNodo]) {
                continue;
            }

            for (Arista arista : grafo.nodos.get(actual.idNodo).aristas) {
                double nuevaDistancia = distancias[actual.idNodo] + arista.peso;
                if (nuevaDistancia < distancias[arista.nodoDestino]) {
                    distancias[arista.nodoDestino] = nuevaDistancia;
                    minHeap.offer(new Par(arista.nodoDestino, nuevaDistancia));
                }
            }
        }

        // Imprimir las distancias más cortas
        for (int i = 0; i < distancias.length; i++) {
            System.out.println("Distancia más corta desde el nodo " + idNodoInicio + " al nodo " + i + ": " + distancias[i]);
        }
    }
}
