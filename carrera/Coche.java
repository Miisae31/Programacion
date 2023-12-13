package carrera;

public class Coche {
	private String motor;
	private String color;
	private String marca;
	private int velocidadMaxima;
	private String dorsal;
	
	public Coche(String marca, int velocidad) {
		this.marca = marca;
		this.velocidadMaxima= velocidad;
		this.motor="";
		this.dorsal="";
		this.color="Blanco";
	}
	
	public String getMotor() {
		return this.motor;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getDorsal() {
		return this.dorsal;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public void setMotor(String valor) {
		this.motor = valor;
	}
	
	public void setColor(String valor) {
		this.color = valor;
	}
	
	public void setVelocidadMaxima(int valor) {
		this.velocidadMaxima = valor;
	}
	
	public int correr() {
		return (int)(Math.random() * this.velocidadMaxima);
	}
	
	public void frenar() {
		// Definir el metodo
	}
	
	public void averiarse() {
		// Definir el metodo
	}
}	

	
