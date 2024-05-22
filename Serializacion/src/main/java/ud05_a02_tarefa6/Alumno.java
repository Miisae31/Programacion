package ud05_a02_tarefa6;
import java.io.Serializable;
public class Alumno implements Serializable{
    String nome;
    String dni;
    int idade;
    float nota;
    boolean repite;

    Alumno(String n, String d, int i, float cal, boolean r) {
        if (n.length() > 10) {
            nome = n.substring(0, 10);
        } else {
            nome = n;
        }

        dni = d;
        idade = i;
        nota = cal;
        repite = r;
    }

    @Override
    public String toString() {
        return nome+"\t"+dni+"\t"+idade+"\t"+nota+"\t"+repite;
    }
}