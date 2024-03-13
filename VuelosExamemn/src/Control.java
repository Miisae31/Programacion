import java.time.LocalDateTime;
import java.util.Iterator;

public class Control {
    private ColaVuelos colaVuelos;

    public Control() {
        this.colaVuelos = new ColaVuelos();
    }

    public void agregarVuelo(String codigoVuelo, LocalDateTime horaSalida, LocalDateTime horaLlegada) {
        Vuelo vuelo = new Vuelo(codigoVuelo, horaSalida, horaLlegada);
        this.colaVuelos.agregarVuelo(vuelo);
    }

    public void eliminarVuelo(String codigoVuelo) {
        Iterator<Vuelo> iterador = this.colaVuelos.obtenerIterador();
        while (iterador.hasNext()) {
            Vuelo vuelo = iterador.next();
            if (vuelo.getCodigoVuelo().equals(codigoVuelo)) {
                this.colaVuelos.eliminarVuelo(vuelo);
                break;
            }
        }
    }

    public void actualizarVuelos() {
        LocalDateTime ahora = LocalDateTime.now();
        Iterator<Vuelo> iterador = this.colaVuelos.obtenerIterador();
        while (iterador.hasNext()) {
            Vuelo vuelo = iterador.next();
            if (vuelo.getHoraSalida().isBefore(ahora)) {
                iterador.remove();
            }
        }
    }

    public void mostrarVuelos() {
        Iterator<Vuelo> iterador = this.colaVuelos.obtenerIterador();
        while (iterador.hasNext()) {
            Vuelo vuelo = iterador.next();
            System.out.println("Código de vuelo: " + vuelo.getCodigoVuelo());
            System.out.println("Hora de salida: " + vuelo.getHoraSalida());
            System.out.println("Hora de llegada: " + vuelo.getHoraLlegada());
            System.out.println("-----------------------------");
        }
    }

    public void darSalidaVuelo() {
        Vuelo vuelo = this.colaVuelos.obtenerSiguienteVuelo();
        if (vuelo != null) {
            System.out.println("El vuelo " + vuelo.getCodigoVuelo() + " ha salido.");
        } else {
            System.out.println("No hay vuelos en la cola.");
        }
    }

    public void retrasarVuelo(String codigoVuelo, int retraso) {
        Iterator<Vuelo> iterador = this.colaVuelos.obtenerIterador();
        while (iterador.hasNext()) {
            Vuelo vuelo = iterador.next();
            if (vuelo.getCodigoVuelo().equals(codigoVuelo)) {
                LocalDateTime nuevaHoraSalida = vuelo.getHoraSalida().plusMinutes(retraso);
                LocalDateTime nuevaHoraLlegada = vuelo.getHoraLlegada().plusMinutes(retraso);
                vuelo.setHoraSalida(nuevaHoraSalida);
                vuelo.setHoraLlegada(nuevaHoraLlegada);
                System.out.println("Horarios del vuelo " + codigoVuelo + " actualizados.");
                break;
            }
        }
    }
}