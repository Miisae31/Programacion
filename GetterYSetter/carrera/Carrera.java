package carrera;

public class Carrera {
	public static void main(String[] args) {
		Circuito ferrol = new Circuito(5,100);
		Coche coche1 = new Coche("Aston Martin",33);
		Coche coche2 = new Coche("Ferrari",30);
		boolean carrera = true;
		Coche lider = coche1;
		
		
		
		
		while(carrera)
		{
			ferrol.calles[0] += coche1.correr();
			ferrol.calles[1] += coche2.correr();
			System.out.println("Coche 1 " + ferrol.calles[0]);
			System.out.println("Coche 2 " + ferrol.calles[1]);
			if(ferrol.calles[0] > ferrol.calles[1]) {
				if (!lider.equals(coche1)) {
					lider = coche1;	
					System.out.println("El coche 1 se pone por delante");
			} else if (ferrol.calles[0] < ferrol.calles[1]) {
				if (!lider.equals(coche2)) {
				lider = coche2;
				System.out.println("Coche 2 se pone por delante");
				}
			}
			}
			
			if(ferrol.calles[0] >= ferrol.fin || ferrol.calles[1] >= ferrol.fin) {
				carrera = false;
				if (ferrol.calles[0] > ferrol.calles[1]) {
					System.out.println("Ganador Aston Martin");
				} else if (ferrol.calles[0] < ferrol.calles[1]) {
				System.out.println("Ganador Ferrari");
				
				} else {
					System.out.println("La foto finish no decide el ganador, Empate");
				}
			}
			
			
				
		
	}

	}
}