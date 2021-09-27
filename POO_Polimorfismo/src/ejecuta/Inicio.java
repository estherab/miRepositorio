package ejecuta;

import clases.Coche;
import clases.ECombustible;
import clases.Tren;
import clases.Vehiculo;

public class Inicio {

	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[2];
		Vehiculo v;
		
		Coche miCoche = new Coche("Coche", 1300, "Verde", true, ECombustible.gasolina);
		Tren miTren = new Tren("Tren", 14000, "Azul", 10, true);
		
		// System.out.println(miCoche.toString());
		// System.out.println(miTren.toString());
		
		// 1 - Hacemos uso del polimorfismo para almacenar en el array objetos de distinto tipo
		// vehiculos[0] = (Vehiculo)miCoche;
		vehiculos[0] = miCoche;
		
		// vehiculos[1] = (Vehiculo)miTren;
		vehiculos[1] = miTren;
		
		/*for (int i = 0; i < vehiculos.length; i++) {
			v = vehiculos[i];
			
			if (v instanceof Tren) {
				miTren = (Tren) v;
				System.out.println(miTren.toString());
			}
			
			else if (v instanceof Coche) {
				miCoche = (Coche) v;
				System.out.println(miCoche.toString());
			}				
		}*/
		
		// 2 - Instanciar un objeto de un tipo como otro
		v = new Tren("Tren", 14000, "Gris", 10, false);
		// System.out.println(v.toString());
		
		miTren = (Tren) v;
		
		v.mostrar(miTren);
		v.mostrar(miCoche);		
	}
}
