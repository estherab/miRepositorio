package ejecuta;

import clases.Hamster;

public class Inicio {

	public static void main(String[] args) {
		
		Hamster miHamster1 = new Hamster("Marrón", "ExtraVital", "Hams", 3);
		
		// Hamster miHamster2 = new Hamster();
		
		String texto = miHamster1.toString();
		System.out.println(texto);
	}
}
