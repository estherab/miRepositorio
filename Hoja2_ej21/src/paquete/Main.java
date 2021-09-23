package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 11 números enteros, para posteriormente
		mostrarlos en el orden inverso al que fueron introducidos.
		*/
		int n = 11;
		int[] nums = new int[n];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 11 números");
		
		for (int i = n-1; i >= 0; i--)
			nums[i] = sc.nextInt();
		
		System.out.println("Orden inverso: " + Arrays.toString(nums));
	}
}
