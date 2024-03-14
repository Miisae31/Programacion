package Examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControlVuelos {
    private List<Vuelo> vuelos;

    public ControlVuelos() {
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public void eliminarVuelo(String codigo) {
        vuelos.removeIf(vuelo -> vuelo.getCodigo().equals(codigo));
    }

    public Vuelo obtenerSiguienteVuelo() {
        // Implement this method based on your requirements
        return null;
    }

    public Iterator<Vuelo> obtenerIterator() {
        return vuelos.iterator();
    }

    public Vuelo buscarVuelo(String codigo) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getCodigo().equals(codigo)) {
                return vuelo;
            }
        }
        return null;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }
}