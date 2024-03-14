package Examen;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Control {
    private final ControlVuelos controlVuelos;

    public Control() {
        this.controlVuelos = new ControlVuelos();
    }

    public void mostrarVuelos() {
        List<Vuelo> vuelos = this.controlVuelos.getVuelos();
        vuelos.sort(Comparator.comparing(Vuelo::getSalida));
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }

    public void salidaVuelo(String codigo) {
        Vuelo vuelo = this.controlVuelos.buscarVuelo(codigo);
        if (vuelo != null) {
            if (LocalDateTime.now().isAfter(vuelo.getSalida()) || LocalDateTime.now().isEqual(vuelo.getSalida())) {
                System.out.println("El avion con el codigo " + vuelo.getCodigo() + " ha despegado.");
                this.controlVuelos.eliminarVuelo(codigo);
            } else {
                System.out.println("El avion con el codigo " + vuelo.getCodigo() + " no esta listo para despegar.");
            }
        } else {
            System.out.println("No se encontró el vuelo con el código proporcionado");
        }
    }

    public void actualizarVuelos() {
        Iterator<Vuelo> iterator = this.controlVuelos.obtenerIterator();
        while (iterator.hasNext()) {
            Vuelo vuelo = iterator.next();
            if (vuelo.getSalida().isBefore(LocalDateTime.now())) {
                iterator.remove();
            }
        }
    }

    public void modificarHorarioVuelo(String codigo, int minutos) throws HorarioVueloException {
        Vuelo vuelo = this.controlVuelos.buscarVuelo(codigo);
        if (vuelo != null) {
            LocalDateTime nuevaSalida = vuelo.getSalida().plusMinutes(minutos);
            LocalDateTime nuevaLlegada = vuelo.getLlegada().plusMinutes(minutos);
            if (nuevaSalida.isBefore(LocalDateTime.now())) {
                throw new HorarioVueloException("La hora no puede ser anterior a la hora actual");
            }
            vuelo.actualizarHorario(nuevaSalida, nuevaLlegada);
        } else {
            System.out.println("No se encontró el vuelo con el código proporcionado");
        }
    }

    public void agregarVuelo(Vuelo vuelo) {
        this.controlVuelos.agregarVuelo(vuelo);
    }
}