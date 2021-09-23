package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		20. Realiza un programa que lea desde teclado 9 números. A continuación nos pedirá que
		busquemos un número entre los introducidos, y nos dirá si ha sido encontrado o no. En el
		caso en el que haya sido encontrado, nos indicará cuántas veces se ha introducido. El
		programa nos preguntará si queremos seguir buscando más números o no: “¿Desea
		seguir buscando?(s/n)”.
		*/
		
		Scanner sc = new Scanner(System.in);
		int tam = 9, busqueda, frecuencia = 0;
		String entrada;
		
		int[] nums = new int[tam];
		
		System.out.println("Introduce 9 números");
		for (int i = 0; i < tam; i++) 
			nums[i] = sc.nextInt();
		
		System.out.println("Contenido del array: " + Arrays.toString(nums));
		
		System.out.println("¿Desea hacer una búsqueda en el array (s/n)?");
		entrada = sc.next();
		
		while (entrada.equals("s")) {
			System.out.println("Número a buscar: ");
			busqueda = sc.nextInt();
			frecuencia = 0;
			
			for (int j = 0; j < tam; j++) 
				if (nums[j] == busqueda)
					frecuencia++;
			
			if (frecuencia == 1)
				System.out.println("Elemento encontrado 1 vez");
			
			else if (frecuencia > 1)
				System.out.println("Elemento encontrado " + frecuencia + " veces");
			
			else
				System.out.println("Elemento no encontrado");
			
			System.out.println("¿Desea hacer una búsqueda en el array (s/n)?");
			entrada = sc.next();
		}
	}
}
