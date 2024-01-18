package carrera;

public class Circuito {
	 public int[] calles;
	 public int fin;
	
	
	public Circuito(int calles, int fin) {
		this.calles = new int [calles];
		this.fin = fin;
	for (int i = 0; i < calles; i++) {
		this.calles[i] = 0;
	}
}

}	
