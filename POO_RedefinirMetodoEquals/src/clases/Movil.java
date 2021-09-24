package clases;

public class Movil {
	// ATRIBUTOS
	private int imei;
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	// CONSTRUCTORES
	public Movil() {
		
	}
	
	public Movil(int imei, int memoria, String marca, int tamanoPantalla) {
		this.imei = imei;
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
	}		
	
	// GETTERS Y SETTERS
	public int getImei() {
		return imei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}
	
 
	public void setImei(int imei) {
		this.imei = imei;
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
	
	@Override
	public boolean equals(Object o) {
		
		Movil movilCompara = (Movil) o;
		boolean iguales;
		
		iguales = this.imei == movilCompara.imei;
		
		return iguales;
	}
	
	public void aumentarMemoria() {
		
		this.memoria++;
	}	
}
