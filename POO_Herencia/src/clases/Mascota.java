package clases;

public class Mascota {
	
	public String nombre;
	public int edad;
	
	public Mascota() {
		
	}

	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/*
	public String mostrar() {
		
		String texto;
		
		texto = "NOMBRE: " + this.nombre + " \n" + "EDAD: " + this.edad;
		
		return texto;
	}
	*/
	
	@Override
	public String toString() {
		String texto;
		
		texto = "NOMBRE: " + this.nombre + " \n" + "EDAD: " + this.edad + "\n";
		
		return texto;
	}
}
