package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 10 números sin repetir. Si el usuario introduce
		algún número repetido se le debe notificar, y no ha de ser contabilizado.
		*/
		int n = 10, tmp, i = 0;
		int[] nums = new int[n];
		boolean encontrado = false; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 números: ");
		
		while (i < n) {
			tmp = sc.nextInt();
			
			for (int j = 0; j < i && !encontrado; j++)
				if (nums[j] == tmp)
					encontrado = true;
			
			if (encontrado) {
				System.out.println("El número está repetido. No se contabiliza");
				encontrado = false;
			}				
		
			else {
				nums[i] = tmp;
				i++;
			}			
		}
		
		System.out.println("Números introducidos: " + Arrays.toString(nums));
	}
}
