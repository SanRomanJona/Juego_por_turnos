
public class Jugador1 {
	 String nombre;
	 int vida;
	 int fuerza;
	 int numero;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	
	public int generadorDeFuerza() {
		return numero = (int) Math.floor((Math.random() * getFuerza()) + 1);
	}
	
	public int recibegolpe(int a) {
	vida -= a; return vida;
	};
	
}
