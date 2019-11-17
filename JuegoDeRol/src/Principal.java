import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String nombre;
		int vida1=0,vida2=0;
		float fuerfinal = 0;
		
		Jugador1 obj1 = new Jugador1();
		Jugador1 obj2 = new Jugador2();

		String nombre1 = JOptionPane.showInputDialog(null, "Vamos a darle nombre s nuestros 2 contrincantes, el primero como deveria llamarse?");
		obj1.setNombre(nombre1);
		
		String nombre2  = JOptionPane.showInputDialog(null, "Ahora vamos a colocarle el nombre al jugador numero 2, como deveria llamarce?");
		obj2.setNombre(nombre2);

		 int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta fuerza va a tener :"+ obj1.getNombre()+ " ?")); 
		 obj1.setFuerza(valor);
	

		valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta fuerza va a tener :"+ obj2.getNombre()+ " ?"));
		obj2.setFuerza(valor);


		System.out.println("Cuanta vida va a tener: "+ obj1.getNombre()+ " ?");

		vida1 = input.nextInt();

		System.out.println("Cuanta vida va a tener: " + obj2.getNombre()+ " ?");

		vida2 = input.nextInt();


		obj1.setVida(vida1);
		obj2.setVida(vida2);


		while(obj1.getVida() >= 0 && obj2.getVida() >= 0) {

			//El jugador numero 1 hace el ataque

			System.out.println("El Jugador "+ obj1.getNombre()+ " se prepara para atacar!!");

			obj1.setFuerza(obj1.generadorDeFuerza());

			System.out.println(" ");

			System.out.println("A realizado un golpe de "+ obj1.getFuerza());

			obj2.recibegolpe(obj1.getFuerza() );

			System.out.println("Vida restante del oponente: "+ obj2.getNombre() + " es de:" + obj2.getVida());

			System.out.println(" ");

			//Ataca el jugador 2

			System.out.println("El Jugador "+ obj2.getNombre()+ " se prepara para atacar!!");

			obj2.setFuerza(obj2.generadorDeFuerza());

			System.out.println(" ");

			System.out.println("A realizado un golpe de "+ obj2.getFuerza());

			obj1.recibegolpe(obj2.getFuerza() );

			System.out.println("Vida restante del oponente: "+ obj1.getNombre() + " es de:" + obj1.getVida());

			System.out.println(" ");

		}
		if(obj1.getVida()<0) {
			System.out.println("El ganador es el jugador: "+ obj2.getNombre());}
		else {
			System.out.println("El ganador es el jugador: "+ obj1.getNombre());
		}
	}
}
