
public class Jugador1 {
	private String nombre;
	private int vida=0, fuerza=0, numero =0;
	
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
	
	
	public int generadorDeFuerza(int numero) {
		return  (int) Math.floor((Math.random() * numero) + 1);
	}
	
	public void recibegolpe(int recibegolpe) {
		this.vida -= recibegolpe;
	}
	
}
