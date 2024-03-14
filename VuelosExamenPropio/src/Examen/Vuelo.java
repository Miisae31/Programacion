package Examen;

import java.time.LocalDateTime;
    public class Vuelo implements Comparable<Vuelo> {
        private String codigoVuelo;
        private LocalDateTime horaSalida;
        private LocalDateTime horaLlegada;

        public Vuelo(String codigoVuelo, LocalDateTime horaSalida, LocalDateTime horaLlegada) {
            this.codigoVuelo = codigoVuelo;
            this.horaSalida = horaSalida;
            this.horaLlegada = horaLlegada;
        }

        public String getCodigoVuelo() {
            return codigoVuelo;
        }

        public void setCodigoVuelo(String codigoVuelo) {
            this.codigoVuelo = codigoVuelo;
        }

        public LocalDateTime getHoraSalida() {
            return horaSalida;
        }

        public void setHoraSalida(LocalDateTime horaSalida) {
            this.horaSalida = horaSalida;
        }

        public LocalDateTime getHoraLlegada() {
            return horaLlegada;
        }

        public void setHoraLlegada(LocalDateTime horaLlegada) {
            this.horaLlegada = horaLlegada;
        }

        @Override
        public int compareTo(Vuelo otro) {
            return this.horaSalida.compareTo(otro.horaSalida);
        }
    }


