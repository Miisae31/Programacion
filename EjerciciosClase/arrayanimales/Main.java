package arrayanimales;

public class Main {

	public static void main(String[] args) {
		Gato[] gatos = new Gato [6];
		Mamifero[] mamiferos = new Mamifero [6];
		Animal[] animales = new Animal [6];
		Gato g1 = new Gato("Gato1");
        Gato g2 = new Gato("Gato2");
        Perro p1 = new Perro ("Perro1");
        Perro p2 = new Perro ("Perro2");
        Canario c1 = new Canario ("Canario1");
        Canario c2 = new Canario ("Canario2");
        
       gatos[0]= g1;
       gatos[1]= g2;
       mamiferos[0]=g1;
       mamiferos[1]=g2;
       mamiferos[2]=p1;
       mamiferos[3]=p2;
       animales[0]=g1;
       animales[1]=g2;
       animales[2]=p1;
       animales[3]=p2;
       animales[4]=c1;
       animales[5]=c2;
       
        
       System.out.println(g1.toString());
       System.out.println(gatos[0]);
       System.out.println(mamiferos[0]);
       System.out.println(animales[0]);
		

	}

}
