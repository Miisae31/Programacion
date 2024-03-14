package Examen;

import examen240314.VueloAbstract;

import java.time.LocalDateTime;

public class Vuelo extends VueloAbstract {
    public Vuelo(String codigo, String origen, String destino, LocalDateTime salida, LocalDateTime llegada) {
        super(codigo, origen, destino, salida, llegada);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "codigo='" + getCodigo() + '\'' +
                ", origen='" + getOrigen() + '\'' +
                ", destino='" + getDestino() + '\'' +
                ", salida=" + getSalida() +
                ", llegada=" + getLlegada() +
                '}';
    }

    @Override
    public String getCodigo() {
        return super.getCodigo();
    }
    @Override
    public String getOrigen() {
        return super.getOrigen();
    }
    @Override
    public String getDestino() {
        return super.getDestino();
    }
    @Override

    public LocalDateTime getSalida() {
        return super.getSalida();
    }
    @Override

    public LocalDateTime getLlegada() {
        return super.getLlegada();
    }


    public void actualizarHorario(LocalDateTime nuevaSalida, LocalDateTime nuevaLlegada) {
        super.setSalida(nuevaSalida);
        super.setLlegada(nuevaLlegada);
    }
}

