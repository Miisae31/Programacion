package mascota;

public class Main {

    public static void main(String[] args) {
        // Crear un array de Mascotas (que incluye tanto Perros como Gatos)
        Mascota[] mascotas = new Mascota[8];

        // Crear 4 perros
        for (int i = 0; i < 4; i++) {
            Sexo sexo = obtenerSexo(i);
            mascotas[i] = new Perro(sexo, "P" + (i + 1));
        }

        // Crear 4 gatos
        for (int i = 4; i < 8; i++) {
            Sexo sexo = obtenerSexo(i);
            mascotas[i] = new Gato(sexo, "G" + (i - 3));
        }

        // Acceder a los elementos del array y realizar acciones
        for (Mascota mascota : mascotas) {
            if (mascota instanceof Gato) {
                Gato gato = (Gato) mascota;
                System.out.println("Código: " + gato.getCodigo() + ", Sexo: " + gato.getSexo());
            } else {
                System.out.println("Código: " + mascota.getCodigo());
            }
            mascota.hazRuido();
            mascota.peleaCon(new Perro(Sexo.MACHO, "OtroPerro"));
            System.out.println();
        }
    }

    private static Sexo obtenerSexo(int posicion) {
        if (posicion % 3 == 0) {
            return Sexo.HEMBRA;
        } else if (posicion % 3 == 1) {
            return Sexo.MACHO;
        } else {
            return Sexo.HERMAFRODITA;
        }
    }
}