package mascota;

public class Gato extends Animal implements Mascota {
    private String codigo;

    public Gato(Sexo s, String c) {
        super(s);
        this.codigo = c;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }
    
    @Override
    public void come(String comida) {
        System.out.println("El gato come " + comida);
    }

    @Override
    public void peleaCon(Animal contrincante) {
        System.out.println("El gato pelea con " + contrincante.getClass().getSimpleName());
    }

    @Override
    public void hazRuido() {
        this.maulla();
    }

    public void maulla() {
        System.out.println("Miau miau");
    }
}