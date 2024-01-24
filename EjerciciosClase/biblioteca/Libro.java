package biblioteca;

public class Libro extends Publicacion implements Prestable {
	private boolean prestado;
	public Libro(String isbn, String titulo, int añoDePublicacion) {
		super(isbn,titulo,añoDePublicacion);
		this.prestado = false; 
	}
	public void presta() {
		this.prestado = true;
		
	}
	
	public void devuelve() {
		this.prestado = false;
		
	}
	
	public  boolean estaPrestado() {
		return prestado;
	}
	
	
	@Override
		public String toString() {
		String estadoPrestado = (this.prestado ? " (prestado)" : " (no prestado)");
	    return "ISBN: " + getIsbn() + ", título: " + getTitulo() + ", año de publicación: " + getAñoDePublicacion() + estadoPrestado;
	}
}
