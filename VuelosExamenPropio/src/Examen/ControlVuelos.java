package Examen;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ControlVuelos {


    private List<Vuelo> cola;
    
    public ControlVuelos () {
        this.cola = new ArrayList<>();

    }

    public void mostrarVuelos () {
        Iterator<Vuelo> iterador = this.cola.iterator();
        while (iterador.hasNext()) {
            Vuelo vuelo = iterador.next();
            System.out.println("Codigo del vuelo " + vuelo.getCodigoVuelo());
            System.out.println("Hora de salida " + vuelo.getHoraSalida());
            System.out.println("Hora de llegada " + vuelo.getHoraLlegada());
            System.out.println("------------------------------------------------");
        }
    }

    public void agregarVuelo (Vuelo vuelo) {
            this.cola.add(vuelo);
    }

    public void eliminarVuelo (Vuelo vuelo) {
            this.cola.remove(vuelo);
    }

    public Vuelo obtenerSiguienteVuelo () {
        if (this.cola.isEmpty()) {
            return this.cola.remove(0);
        }
        return null;
    }

    public Iterator<Vuelo> obtenerIterator() {
        return this.cola.iterator();
    }


    public void actualizarVuelos() {
        LocalDateTime ahora = LocalDateTime.now();
        Iterator<Vuelo> iterador = this.cola.iterator();
        while (iterador.hasNext()) {
            Vuelo vuelo = iterador.next();
            if (vuelo.getHoraSalida().isBefore(ahora)) {
                iterador.remove();
            }
        }
    }
        public void SalidaVuelo(Vuelo vuelo) {
        if (this.cola.isEmpty()) {
            this.cola.remove(0);
        }
    }

    public void retrasarVuelo(Vuelo vuelo, LocalDateTime nuevaHoraLlegada) {
        vuelo.setHoraLlegada(nuevaHoraLlegada);
    }

}
