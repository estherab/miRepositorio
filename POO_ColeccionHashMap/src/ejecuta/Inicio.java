package ejecuta;

import java.util.HashMap;

public class Inicio {

	public static void main(String[] args) {
		
		HashMap<String, Integer> temperaturasMaxEstacion = new HashMap<String, Integer>();
		int temperatura, valor;
		
		temperaturasMaxEstacion.put("Otoño", 20);
		temperaturasMaxEstacion.put("Invierno", 10);
		temperaturasMaxEstacion.put("Primavera", 15);
		temperaturasMaxEstacion.put("Verano", 40);
		
		System.out.println("La temperatura máxima en primavera es de " + temperaturasMaxEstacion.get("Primavera") + " grados");
	
		if (temperaturasMaxEstacion.containsKey("Primavera")) {
			temperaturasMaxEstacion.remove("Primavera");
			System.out.println("\nElemento eliminado");
		}
		
		else
			System.out.println("\nNo se ha eliminado porque no se encuentra el elemento");
		
		// Muestra null porque se ha borrado el elemento		
		// System.out.println("La temperatura máxima en primavera es de " + temperaturasMaxEstacion.get("Primavera") + " grados");

		valor = 99;
		if (temperaturasMaxEstacion.containsValue(valor))
			System.out.println("\nEl valor " + valor + " está en la colección\n");
		
		else
			System.out.println("\nEl valor " + valor + " NO está en la colección\n");
				
		// Si la clave ya existe, se sobreescribe el valor
		temperaturasMaxEstacion.put("Verano", 42);
		
		// Recorremos la colección
		for (String clave:temperaturasMaxEstacion.keySet()) {
			temperatura = temperaturasMaxEstacion.get(clave);
			
			System.out.println("La temperatura máxima en "+ clave + " es de " + temperatura + " grados.");
		}
	}
}
