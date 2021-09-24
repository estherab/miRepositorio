package clases;

public class Movil {
	// ATRIBUTOS
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	// CONSTRUCTORES
	public Movil() {
		
	}
	
	public Movil(int memoria, String marca, int tamanoPantalla) {
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
	}		
	
	// GETTERS Y SETTERS
	public int getMemoria() {
		return memoria;
	}
	public String getMarca() {
		return marca;
	}
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}

	@Override
	public String toString() {
		
		return "MEMORIA: " + this.memoria + "\n" +
			   "MARCA: " + this.marca + "\n" + 
			   "TAMAÑO PANTALLA: " + this.tamanoPantalla + "\n";
	}
	
	public void aumentarMemoria() {
		
		this.memoria++;
	}
}
