package ejecuta;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {

		Movil movilJuan = new Movil(1, 4, "Xiaomi", 3);
		Movil movilMaria = new Movil(2, 4, "Xiaomi", 3);
		
		/*if (movilMaria.getMemoria() == movilJuan.getMemoria() &&
			movilMaria.getMarca().equals(movilJuan.getMarca()) &&
			movilMaria.getTamanoPantalla() == movilJuan.getTamanoPantalla())
			System.out.println("Iguales");
		
		else
			System.out.println("Diferentes");
		*/
		if (movilJuan.getImei() == movilMaria.getImei())
			System.out.println("Iguales");
		
		else
			System.out.println("Diferentes");
	}
}
