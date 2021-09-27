package clases;

public class Tren extends Vehiculo {
	public int vagones;
	public boolean largoRecorrido;
	
	public Tren() {
		super();
	}

	public Tren(String tipo, int peso, String color, int vagones, boolean largoRecorrido) {
		super(tipo, peso, color);
		
		this.vagones = vagones;
		this.largoRecorrido = largoRecorrido;
	}

	@Override
	public String toString() {
		
		return super.toString() + 
			   "Nº VAGONES: " + this.vagones + "\n" +
			   "LARGO RECORRIDO: " + ((this.largoRecorrido)?"Sí":"No") + "\n\n";
	}
}
