package paquete;

public class Cafetera {
	public int volumen;
	public int volumenVaso;
	public int volumenTaza;
	
	public Cafetera(int volumen, int volumenVaso, int volumenTaza) {
		this.volumen = volumen;
		this.volumenVaso = volumenVaso;
		this.volumenTaza = volumenTaza;
	}

	public Cafetera() {
		
	}
	
	public int servirTaza() {
		
		if (this.volumen >= this.volumenTaza) {
			this.volumen -= this.volumenTaza;
			System.out.println("Taza servida");
		}
		
		else 
			System.out.println("No hay suficiente café para servir la taza");
		
		return this.volumen;
	}
	
	public int servirVaso() {
		
		if (this.volumen >= this.volumenVaso) {
			this.volumen -= this.volumenVaso;
			System.out.println("Vaso servido");
		}
		
		else 
			System.out.println("No hay suficiente café para servir el vaso");
		
		return this.volumen;
	}
	
	public void mostrar() {
		
		System.out.println("VOLUMEN CAFETERA: " + this.volumen + 
						   "\nVOLUMEN TAZA: " + this.volumenTaza +
						   "\nVOLUMEN VASO: " + this.volumenVaso + "\n");
	}	
}
