import java.io.Serializable;
public class ClaseExemplo implements Serializable {
    private String nome;

    public ClaseExemplo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
