import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int vida1=0, vida2=0, valor=0, valor2=0, numeroTurno =0;

		Jugador1 obj1 = new Jugador1();
		Jugador1 obj2 = new Jugador2();

		String nombre1 = JOptionPane.showInputDialog(null, "El primero como deveria llamarse?");
		obj1.setNombre(nombre1);

		String nombre2  = JOptionPane.showInputDialog(null, "Ahora vamos a colocarle el nombre al jugador numero 2, como deveria llamarce?");
		obj2.setNombre(nombre2);

		valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta fuerza va a tener: "+ obj1.getNombre()+ " ?")); 
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta fuerza va a tener: "+ obj2.getNombre()+ " ?"));

		obj1.setFuerza(valor);
		obj2.setFuerza(valor2);


		vida1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta vida va a tener: " + obj1.getNombre()+ " ?"));
		obj1.setVida(vida1);

		vida2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanta vida va a tener: " + obj2.getNombre()+ " ?"));
		obj2.setVida(vida2);


		do {

			// Contador de Ronda

			numeroTurno++;

			JOptionPane.showMessageDialog(null, "Ronda numero: " + numeroTurno);

			//El jugador numero 1 hace el ataque

			JOptionPane.showMessageDialog(null, "El Jugador "+ obj1.getNombre()+ " se prepara para atacar!!" );	


			JOptionPane.showMessageDialog(null, "A realizado un golpe de "+ obj1.generadorDeFuerza(obj1.getFuerza() ));

			obj2.recibegolpe(obj1.getFuerza());

			JOptionPane.showMessageDialog(null, "Vida restante del oponente: "+ obj2.getNombre() + " es de:" + obj2.getVida());

			if(obj1.getVida()<=0 || obj2.getVida() <=0) {

				if(obj1.getVida()<=0){
					JOptionPane.showMessageDialog(null, "El ganador es el jugador: "+ obj2.getNombre()); break;
				} else {
					JOptionPane.showMessageDialog(null, "El ganador es el jugador: "+ obj1.getNombre()); break;
				}
			}

				//Ataca el jugador 2 ------------------------------

				JOptionPane.showMessageDialog(null, "El Jugador "+ obj2.getNombre()+ " se prepara para atacar!!" );	


				JOptionPane.showMessageDialog(null, "A realizado un golpe de "+ obj2.generadorDeFuerza(obj2.getFuerza() ));

				obj1.recibegolpe(obj2.getFuerza());

				JOptionPane.showMessageDialog(null, "Vida restante del oponente: "+ obj1.getNombre() + " es de:" + obj1.getVida());

				if(obj1.getVida()<=0 || obj2.getVida() <=0) {

					if(obj1.getVida()<=0){
						JOptionPane.showMessageDialog(null, "El ganador es el jugador: "+ obj2.getNombre()); break;
					} else {
						JOptionPane.showMessageDialog(null, "El ganador es el jugador: "+ obj1.getNombre()); break;
					}
				}

				}while(obj1.getVida() >= 0 && obj2.getVida() >= 0);
			}

		
	}

