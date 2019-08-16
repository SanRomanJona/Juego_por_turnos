
public class Jugador2 {
	private String nombre;
	private int vida;
	private int fuerza;
	private int numero;
	
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
	public void generadorDeFuerza() {
		numero = (int) (Math.random() * fuerza) + 1;
		
	}
}
