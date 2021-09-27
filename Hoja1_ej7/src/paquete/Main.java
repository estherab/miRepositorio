package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Programa que pide el n�mero de calificaciones a introducir, y una nota de corte. A
		   continuaci�n se introducir�n las calificaciones, para finalmente indicar cu�ntas
		   calificaciones han igualado o superado la nota de corte.
		 */
		int num, superan = 0;
		float nota, corte = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N� de calificaciones: ");
		num = sc.nextInt();
		
		System.out.print("Nota de corte: ");
		corte = sc.nextFloat();
		
		for (int i = 0; i < num; i++) {
			nota = sc.nextFloat();
			if (nota >= corte)
				superan++;		
		}
		
		System.out.println(superan + " notas superan la nota de corte");
		sc.close();
	}
}
