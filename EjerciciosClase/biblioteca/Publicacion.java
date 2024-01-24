package biblioteca;

public class Publicacion {
	private String isbn;
	private String titulo;
	private int añoDePublicacion;
	
	
	public Publicacion(String isbn, String titulo, int añoDePublicacion) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.añoDePublicacion = añoDePublicacion;
		
	}
	
	public String getTitulo() {
		return titulo;
		
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public int getAñoDePublicacion() {
		return añoDePublicacion;
	}

}
