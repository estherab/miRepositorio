package paquete;

public class Main {

	public static void main(String[] args) {
		int suma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 1; j <= 10; j++) {
				suma += i*j;
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println("Suma: " + suma);
			System.out.println();			
			suma = 0;
		}
	}
}
