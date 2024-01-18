package damas;

public class Tablero {
    private static final int TAMANO = 8;
    private Ficha[][] tablero;
    private Ficha.Color turno;

    public Tablero() {
        this.tablero = new Ficha[TAMANO][TAMANO];
        this.turno = Ficha.Color.BLANCA;
    }

    public void inicializarTablero() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if ((i + j) % 2 == 1) {
                    if (i < 3) {
                        tablero[i][j] = new Ficha(Ficha.Color.BLANCA);
                    } else if (i > 4) {
                        tablero[i][j] = new Ficha(Ficha.Color.NEGRA);
                    }
                }
            }
        }
    }

    public void imprimirTablero() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMANO; j++) {
                if (tablero[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

 // Dentro del método moverFicha en la clase Tablero
    public boolean moverFicha(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        // Lógica de movimiento normal...

        // Lógica de captura diagonal
        if (esMovimientoDeCaptura(filaOrigen, columnaOrigen, filaDestino, columnaDestino)) {
            // Realizar captura eliminando la ficha contraria y colocando la tuya
            int filaCaptura = (filaOrigen + filaDestino) / 2;
            int columnaCaptura = (columnaOrigen + columnaDestino) / 2;

            Ficha fichaOrigen = tablero[filaOrigen][columnaOrigen];
            Ficha fichaCaptura = tablero[filaCaptura][columnaCaptura];

            if (fichaCaptura != null && !fichaCaptura.toString().equals(fichaOrigen.toString())) {
                tablero[filaCaptura][columnaCaptura] = null;
                tablero[filaDestino][columnaDestino] = fichaOrigen;
                tablero[filaOrigen][columnaOrigen] = null;

                // Verificar si se pueden realizar más capturas
                if (puedeRealizarOtraCaptura(filaDestino, columnaDestino)) {
                    return true; // Devuelve true para permitir otro turno al mismo jugador
                } else {
                    cambiarTurno();
                    return true;
                }
            }
        }

        return false;
    }

    private boolean esMovimientoDeCaptura(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        // Verificar condiciones para la captura diagonal
        int distanciaFila = Math.abs(filaDestino - filaOrigen);
        int distanciaColumna = Math.abs(columnaDestino - columnaOrigen);

        return distanciaFila == 2 && distanciaColumna == 2;
    }

    private boolean puedeRealizarOtraCaptura(int filaDestino, int columnaDestino) {
        // Implementar la lógica específica para determinar si es posible realizar otra captura consecutiva
        // Por ejemplo, revisar las posiciones adyacentes para posibles capturas adicionales.
        // Retorna true si es posible, false de lo contrario.
        return false;
    }


    public void cambiarTurno() {
        turno = (turno == Ficha.Color.BLANCA) ? Ficha.Color.NEGRA : Ficha.Color.BLANCA;
    }

    public Ficha.Color getTurno() {
        return turno;
    }
}
