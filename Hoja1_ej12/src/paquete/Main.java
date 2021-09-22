package paquete;

public class Main {

	public static void main(String[] args) {
		/*
		 Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		 número es primo si tiene dos únicos divisores que son el 1 y él mismo.
		 */
		boolean divisores = false;
		
		System.out.println("Números primos del 1 al 100: ");
		
		for (int i = 2; i <= 100; i++) {
			divisores = false;
			
			for (int j = 2; j <= i/2 && !divisores; j++) 
				if (i%j == 0) 
					divisores = true;		
			
			if (!divisores)
				System.out.println(i + " ");
		}
	}
}
