package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String menu = ("1. Servir taza" +
					  "\n2. Servir vaso" +
					  "\n3. Mostrar cafetera" + 
					  "\n0. Salir" +
					  "\nIntroduce opción: ");
		
		int opcion = 1, volumen;
		Cafetera cafetera = new Cafetera(1000, 330, 150);
		
		do { 
			System.out.println(menu);
			opcion = sc.nextInt();
		
			switch (opcion) {
				case 1:
					volumen = cafetera.servirTaza();
					
					System.out.println("Volumen restante en la cafetera: " + volumen);
				break;
				
				case 2:
					volumen = cafetera.servirVaso();
					
					System.out.println("Volumen restante en la cafetera: " + volumen);
				break;
				
				case 3:
					cafetera.mostrar();
				break;
				
				default:
					System.out.println("Opción incorrecta");
				break;
			}		
			
		} while (opcion != 0);
		
		sc.close();
	}
}
