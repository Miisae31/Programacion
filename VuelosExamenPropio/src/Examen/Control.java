package Examen;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Control {
    private ControlVuelos controlVuelos;





    public Control() {
        this.controlVuelos = new ControlVuelos();
    }

    public void mostrarVuelos() {
        Iterator<Vuelo> iterator = this.controlVuelos.obtenerIterator();
        while (iterator.hasNext()) {
            Vuelo vuelo = iterator.next();
            System.out.println("Codigo del vuelo " + vuelo.getCodigoVuelo());
            System.out.println("Hora de salida " + vuelo.getHoraSalida());
            System.out.println("Hora de llegada " + vuelo.getHoraLlegada());
            System.out.println("------------------------------------------------");
            Collections.sort((List<Vuelo>) this.controlVuelos);
        }
    }

    public void agregarVuelo(String codigoVuelo, LocalDateTime horaSalida, LocalDateTime horaLlegada) throws FechaHoraSalidaNoValidaException {
        LocalDateTime horaActual = LocalDateTime.now();
        if (horaSalida.isBefore(horaActual)){
            throw new FechaHoraSalidaNoValidaException("La fecha de salida no puede ser anterior a la fecha actual");
        }
        Vuelo vuelo = new Vuelo(codigoVuelo, horaSalida, horaLlegada);
        this.controlVuelos.agregarVuelo(vuelo);

    }

    public void eliminarVuelo(String codigoVuelo, LocalDateTime horaSalida, LocalDateTime horaLlegada) {
        Iterator<Vuelo> iterator = this.controlVuelos.obtenerIterator();
        while (iterator.hasNext()) {
            Vuelo vuelo = iterator.next();
            this.controlVuelos.eliminarVuelo(vuelo);
            if (vuelo.getCodigoVuelo().equals(codigoVuelo)) {
                this.controlVuelos.eliminarVuelo(vuelo);
                break;
            }
        }
    }

    public void salidaVuelo() {
        Vuelo vuelo = this.controlVuelos.obtenerSiguienteVuelo();
        if (vuelo != null) {
            System.out.println("El avion con el siguiente codigo" + vuelo.getCodigoVuelo() + " ha despegado.");
        } else {
            System.out.println("No hay vuelos programados con ese codigo");
        }


    }

    public void actualizarVuelo(String codigoVuelo, LocalDateTime horaSalida, LocalDateTime horaLlegada) throws ValorNoValidoException {
        LocalDateTime ahora = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt() < 1){
            throw new ValorNoValidoException("Los minutos ingresados no pueden ser negativos");
        }
        Iterator <Vuelo> iterator = this.controlVuelos.obtenerIterator();
        while (iterator.hasNext()){
            Vuelo vuelo = iterator.next();
            if (vuelo.getHoraSalida().isBefore(ahora)){
                iterator.remove();
            } else {
                System.out.println("El vuelo ya ha despegado, no se puede modificar");
            }
        }
    }

    public void retrasarVuelo (String codigoVuelo , LocalDateTime horaSalida, LocalDateTime horaLlegada ) {
        Iterator <Vuelo> iterator = this.controlVuelos.obtenerIterator();
        while (iterator.hasNext()){
            Vuelo vuelo = iterator.next();
            if (vuelo.getCodigoVuelo().equals(codigoVuelo)){
                vuelo.setHoraSalida(horaSalida);
                vuelo.setHoraLlegada(horaLlegada);

            }
        }
    }


}

