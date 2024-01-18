package vehiculo;

public class Vehiculo {
		private int kilometrosRecorridos;

	public Vehiculo() {
		this.kilometrosRecorridos = 0;
	}
	
	public void andar (int distancia) {
		this.kilometrosRecorridos += distancia;
		System.out.println("Andando "+ distancia + "kilometros");
	}
	
	public void quemarRueda () {
		System.out.println("Quemando Rueda");
	}
	
	public void verKilometraje(){
		
		System.out.println("Kilometraje total: "+ this.kilometrosRecorridos+ " kilometros");	
	}
}







