package logic;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
	int id;
    List<Arista> aristas;

    public Nodo(int id) {
        this.id = id;
        this.aristas = new ArrayList<>();
    }
}
