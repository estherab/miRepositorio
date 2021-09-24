package clases;

public class Hamster extends Mascota {
	public String colorPelo;
	public String marcaPienso;
	
	public Hamster() {
		super();
	}
	
	public Hamster(String colorPelo, String marcaPienso,
				   String nombre, int edad) {
		super(nombre, edad);
		
		this.colorPelo = colorPelo;
		this.marcaPienso = marcaPienso;
	}
	
	@Override
	public String toString() {
		String texto;
		
		texto = super.toString() + 
				"COLOR DE PELO: " + this.colorPelo + "\n" +
				"MARCA PIENSO: " + this.marcaPienso;
		
		return texto;
	}
}
