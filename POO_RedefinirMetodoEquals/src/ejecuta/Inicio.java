package ejecuta;

import java.util.HashMap;
import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		HashMap<Integer, Movil> moviles = new HashMap<Integer, Movil>();
	
		Movil movilJuan = new Movil(111, 4, "Samsung", 4);
		Movil movilMaria = new Movil(232, 4, "Apple", 4);
		Movil movilPedro = new Movil(955, 4, "Xiaomi", 5);
		
		Movil movilBusqueda = new Movil(111, 4, "Samsung", 4);
		
		moviles.put(movilJuan.getImei(), movilJuan);
		moviles.put(movilMaria.getImei(), movilMaria);
		moviles.put(movilPedro.getImei(), movilPedro);
	
		if (moviles.containsValue(movilBusqueda)) {
			System.out.println("Encontrado");
		}
		
		else {
			System.out.println("No encontrado");
		}	
	}
}
