package biblioteca;

public class Revista extends Publicacion {
	private int numero;

	public Revista(String isbn, String titulo, int añoDePublicacion, int numero) {
		super(isbn,titulo,añoDePublicacion);
		this.numero = numero;
	}
	public String toString() {
		return "ISBN: " + getIsbn() + ", título: " + getTitulo() + ", año de publicación: " + getAñoDePublicacion();
	}

}
