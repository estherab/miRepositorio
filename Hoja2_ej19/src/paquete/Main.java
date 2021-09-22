package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] nums = new int [10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 números: ");
		
		for(int i=0; i<10;  i++)
			nums[i] = sc.nextInt();  
		
		sc.close();
		
		System.out.print("Los numeros pares son: ");
		
		for(int i=0; i<10; i++)
			if(nums[i]%2==0)
				System.out.print(nums[i] + " ");				
		
		System.out.println();
		System.out.println("Contenido del array: " + Arrays.toString(nums));		
	}
}