                                package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Programa que lee de manera consecutiva n�meros hasta que se introducen dos n�meros
			iguales seguidos.
		 */
		int num1 = 0, num2 = 1;
		Scanner sc = new Scanner(System.in);
		
		while (num1 != num2) {
			System.out.print("N�mero: ");
			num1 = sc.nextInt();
			
			if (num1 != num2) {
				System.out.print("N�mero: ");
				num2 = sc.nextInt();
			}			
		}
		System.out.println("TERMINADO. N�meros iguales");
		sc.close();
	}
}
