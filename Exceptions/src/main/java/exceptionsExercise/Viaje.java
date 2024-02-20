package exceptionsExercise;

public class Viaje {
    public String ir(String origen, String destino) throws Throwable {
        throw new AccidenteLeveException("Accidente leve");
    }

    public String viaje(String origen, String destino) {
        try {
            return ir(origen, destino);
        }   catch (AccidenteLeveException e) {
            return "llego tarde";
        } catch (AccidenteGraveException e ) {
            return "no llego nunca";
        } catch (AccidenteException e) {
            return "al hospital";
        } catch (ViajeException e) {
            return "Error desconocido";
        } catch (Throwable t) {
            return "Error general";
        }
    }

    public static void main(String[] args) {
        Viaje viaje = new Viaje();
        String origen = "Madrid";
        String destino = "Barcelona";

        try {
            System.out.println("Resultado de ir: " + viaje.ir(origen, destino));
        } catch (Throwable t) {
            System.out.println("Excepción lanzada en ir: " + t.getMessage());
        }

        System.out.println("Resultado de viaje: " + viaje.viaje(origen, destino));
    }
}













