import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String nombre;
		int vida1=0, vida2=0, valor=0;
		float fuerfinal = 0;
		
		Jugador1 obj1 = new Jugador1();
		Jugador1 obj2 = new Jugador2();

		String nombre1 = JOptionPane.showInputDialog(null, "El primero como deveria llamarse?");
		obj1.setNombre(nombre1);
		
		String nombre2  = JOptionPane.showInputDialog(null, "Ahora vamos a colocarle el nombre al jugador numero 2, como deveria llamarce?");
		obj2.setNombre(nombre2);

		valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta fuerza va a tener: "+ obj1.getNombre()+ " ?")); 
		valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta fuerza va a tener: "+ obj2.getNombre()+ " ?"));
		
		obj1.setFuerza(valor);
		obj2.setFuerza(valor);


		vida1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta vida va a tener: " + obj1.getNombre()+ " ?"));
		vida2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta vida va a tener: " + obj2.getNombre()+ " ?"));

		obj1.setVida(vida1);
		obj2.setVida(vida2);


		while(obj1.getVida() >= 0 && obj2.getVida() >= 0) {

			//El jugador numero 1 hace el ataque

			JOptionPane.showInternalMessageDialog(null,"El Jugador "+ obj1.getNombre()+ " se prepara para atacar!!" );	
			
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
		
		if(obj1.getVida()<=0) {
			System.out.println("El ganador es el jugador: "+ obj2.getNombre());}
		else {
			System.out.println("El ganador es el jugador: "+ obj1.getNombre());
		}
	}
}
