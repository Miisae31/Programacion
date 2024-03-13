import java.util.Iterator;
import java.util.PriorityQueue;

public class ColaVuelos {
    private PriorityQueue<Vuelo> cola;

    public ColaVuelos() {
        this.cola = new PriorityQueue<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        this.cola.add(vuelo);
    }

    public void eliminarVuelo(Vuelo vuelo) {
        this.cola.remove(vuelo);
    }

    public Vuelo obtenerSiguienteVuelo() {
        return this.cola.poll();
    }

    public Iterator<Vuelo> obtenerIterador() {
        return this.cola.iterator();
    }
}