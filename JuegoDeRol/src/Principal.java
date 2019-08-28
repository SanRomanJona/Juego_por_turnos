import java.util.Scanner;

public class Principal {

		static Scanner input = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		int eleccion,eleccion2,vida1,vida2;
		String nombre1, nombre2;
		
			
		Jugador1 obj1 = new Jugador1();
		
		Jugador2 obj2 = new Jugador2();
		
		System.out.println("Vamos a darle nombre s nuestros 2 contrincantes, el primero como deveria llamarse?");
		nombre1 = input.nextLine();
		
		System.out.println("\nAhora vamos a colocarle el nombre al jugador numero 2, como deveria llamarce?");
		nombre2 = input.nextLine();

		
		obj1.setNombre(nombre1);
		obj2.setNombre(nombre2);

			
	
		
		System.out.println("Cuanta fuerza va a tener el jugador 1 ?");
		
		eleccion = input.nextInt();
		
		System.out.println("Cuanta fuerza va a tener el jugador 2 ?");
		
		eleccion2 = input.nextInt();
		
		System.out.println("Cuanta vida va a tener el jugador 1 ?");
		
		vida1 = input.nextInt();
		
		System.out.println("Cuanta vida va a tener el jugador 2 ?");
		
		vida2 = input.nextInt();

		
		obj1.setFuerza(eleccion);
		for(int i = 1; i<=10;i++) {
		System.out.println(obj1.getNombre() + obj1.generadorDeFuerza());}
		
		obj2.setFuerza(eleccion);
		for(int i = 1; i<=10;i++) {
		System.out.println(obj2.getNombre()+obj2.generadorDeFuerza());}
	
	
	while(obj1.getVida() > 0 && obj2.getVida() > 0) {
		
		
		
	};
	}
}
