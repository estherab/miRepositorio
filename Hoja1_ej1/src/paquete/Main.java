package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Programa que lee dos números A y B, y nos informa si B es divisor de A o no.
		Scanner sc;
		int a, b;
		
		sc = new Scanner(System.in);
		
		System.out.print("A: ");
		a = sc.nextInt();
		
		System.out.print("B: ");
		b = sc.nextInt();
		
		if (a%b == 0) 
			System.out.println(b + " es divisor de " + a);
		
		else
			System.out.println(b + " no es divisor de " + a);	
		
		sc.close();
	}
}
