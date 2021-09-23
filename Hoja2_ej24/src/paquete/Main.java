package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea 25 números para posteriormente mostrarlos en orden
		ascendente.
		*/
		int n = 25;
		int[] nums = new int[n];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce " + n + " números");
		
		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();		
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
