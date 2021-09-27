package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Programa que lee 4 números. Al finalizar mostrará el máximo introducido, 
		 * y cuántas veces se repite dicho máximo.
		 */
		int maximo = 0, veces = 0, num = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			num = sc.nextInt();
			
			if (num > maximo) {
				maximo = num;
				veces = 1;
			}
			
			else if (num == maximo)
				veces++;
		}
		
		System.out.println("Máximo: " + maximo);
		System.out.println("Frecuencia: " + veces);
		
		sc.close();
	}
}
