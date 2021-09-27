package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Programa que lee 3  números comprendidos entre el 20 y 40, ambos inclusive. En el caso
			en el que algún  número introducido no se encontrara dentro del rango permitido, se
			mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
			se hayan introducido 3 números válidos y mostrará el número máximo introducido de los
			3 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
		 */
		int i = 0, n, noValidos = 0, max = 0;
		Scanner sc;
		sc = new Scanner(System.in);
		
		while (i < 3) {
			System.out.print("Número: ");
			n = sc.nextInt();
			
			if (n >= 20 && n <= 40) {
				if (n > max)
					max = n;
				
				i++;
			}
			
			else {
				System.out.println("Los números tienen que estar entre 20 y 40");
				noValidos++;
			}
		}
		System.out.println("Entradas no válidas: " + noValidos);
		System.out.println("Maximo introducido: " + max);
		 
		sc.close();
	}
}
