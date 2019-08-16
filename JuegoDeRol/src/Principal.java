import java.util.Scanner;

public class Principal {

		static Scanner input = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		int eleccion;
			
		Jugador1 obj1 = new Jugador1();
		
		System.out.println("Cuanta fuerza va a tener el jugador 1 ?");
		
		eleccion = input.nextInt();
		
		obj1.setFuerza(eleccion);
		for(int i = 1; i<=10;i++) {
		System.out.println(obj1.generadorDeFuerza());}
	}

}
