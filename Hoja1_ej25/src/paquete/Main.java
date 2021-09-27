package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Realiza un programa que cargue desde teclado una tabla bidimensional de 2x3 de números
		enteros. Posteriormente el programa pedirá un número a buscar, y en caso de encontrarlo
		indicará el número de fila y columna donde se ha encontrado por primera vez. El programa
		ofrecerá al usuario la opción de seguir buscando más números: “¿Desea seguir
		buscando?(s/n)”. 
		*/
		
		int a = 2, b=3;
		int tabla[][]=new int[a][b];
		int busqueda;
		
		char seguir;
		boolean encontrado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 6 números: ");
		for(int i = 0; i < a; i++) 
			for(int j = 0; j < b; j++)			
				tabla[i][j] = sc.nextInt();		
		
		System.out.println("TABLA CARGADA");
		System.out.println(Arrays.deepToString(tabla) + '\n');
		
		do {
			System.out.println("Introduce número a buscar: ");
			busqueda = sc.nextInt();

			encontrado = false;
			
			for(int i = 0; i < a && !encontrado; i++)
				for(int j = 0; j < b && !encontrado; j++)
					if(tabla[i][j] == busqueda) {
						System.out.println("Encontrado en la posición " + (i+1) + "," + (j+1));
						encontrado = true;
					}
		
			if(!encontrado)
				System.out.println("No encontrado");
			
			System.out.println("¿Desea seguir buscando? (s/n)");

			seguir = sc.next().charAt(0);	

		} while (seguir == 's' || seguir == 'S');
		
		sc.close();
		System.out.println("FIN");
	}
}