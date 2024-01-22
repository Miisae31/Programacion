package arrayanimales;

public class Gato extends Animal implements Mamifero {

	public Gato(String nombre) {
		super(nombre);
	
	}
	@Override
	public String toString() {
		return super.toString() + "#" +this.nombre;
	}

}
