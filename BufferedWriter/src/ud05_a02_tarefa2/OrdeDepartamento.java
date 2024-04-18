package ud05_a02_tarefa2;
import java.util.Comparator;
public class OrdeDepartamento implements Comparator <Empregado>{
    @Override
    public int compare(Empregado e1, Empregado e2) {
        int valor;
        if (e1.departamento.equalsIgnoreCase(e2.departamento)) {
            valor = e1.nome.compareToIgnoreCase(e2.nome);
        } else {
            valor = e1.departamento.compareToIgnoreCase(e2.departamento);
        }
        return valor;
    }
}