package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Programa que lee 4 números, y en el caso en el que el primero introducido sea igual al
		último, nos muestra la media. En caso contrario, no se mostrará nada.
		*/
		int primero = 0, ultimo = 0, suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				primero = sc.nextInt();
				suma += primero;
			}
			else if (i == 3) {
				ultimo = sc.nextInt();
				suma += ultimo;
			}
			else
				suma += sc.nextInt();
		}
		
		if (primero == ultimo) 
			System.out.println("Media: " + (float)suma/4);
		
		sc.close();
	}
}
