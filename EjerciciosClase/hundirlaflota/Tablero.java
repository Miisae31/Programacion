package hundirlaflota;

public class Tablero {
    private int fila;
    private int columna;
    private int[][] tablero;

    public Tablero(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.tablero = new int[fila][columna];
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getEstado(int fila, int columna) {
        return tablero[fila][columna];
    }

    public void setEstado(int fila, int columna, int estado) {
        tablero[fila][columna] = estado;
    }

    public void showTableroEstados() { // Creamos el tablero con valores numericos
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showTableroGrafico() { // Creamos el tablero pero con los simbolos correspondientes en vez de los numeros
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                switch (tablero[i][j]) {
                    case 1:
                        System.out.print("# ");
                        break;
                    case 2:
                        System.out.print("~ ");
                        break;
                    case 3:
                        System.out.print("* ");
                        break;
                    case 4:
                        System.out.print("x ");
                        break;
                }
            }
            System.out.println();
        }
    }

    public void setTableroCostaNoroeste() { // Hacemos un tablero predefinido con las zonas de peces
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (i < 3 && j < 3) {
                    tablero[i][j] = 1; // Zona Noroeste: Tierra
                } else if (i < 6 && j < 6) {
                    tablero[i][j] = 2; // Zona de Mar
                } else if (i < 9 && j < 9) {
                    tablero[i][j] = 4; // Zona de Peces SI
                } else {
                    tablero[i][j] = 3; // Resto de la zona: Peces NO
                }
            }
        }
    }

    public void deleteTablero() { // Esto borra el tablero y lo rellena entero de tierra
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero[i][j] = 1; // Poner a "Tierra" todo el tablero
            }
        }
    }

    public void inicializarTablero() { // Se crea inicializa el tablero
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                int valorAleatorio = (int) (Math.random() * 4) + 1;
                tablero[i][j] = valorAleatorio;
            }
        }
    }
}


