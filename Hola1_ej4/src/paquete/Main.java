package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.print("N�mero: ");
		num = sc.nextInt();
		System.out.print("Divisores: ");
		
		for (int i = 1; i <= num/2; i++) {
			if (num%i == 0)
				System.out.print(i + " ");
		}
		sc.close();
	}
}
