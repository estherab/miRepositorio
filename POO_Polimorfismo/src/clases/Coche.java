package clases;

public class Coche extends Vehiculo {
	public boolean camara;
	public ECombustible combustible;
	
	public Coche() {
		super();
	}	
	
	public Coche(String tipo, int peso, String color, boolean camara, ECombustible combustible) {
		super(tipo, peso, color);
		
		this.camara = camara;
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		
		return super.toString() +
			   "CÁMARA: " + ((this.camara)?"Sí":"No") + "\n" + 
			   "COMBUSTIBLE: " + this.combustible + "\n\n";
	}	
}
