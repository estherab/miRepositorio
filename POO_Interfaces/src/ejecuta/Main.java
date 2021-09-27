package ejecuta;

import java.util.Scanner;

import clases.GestionListado;

public class Main {

	public static void main(String[] args) {
		/*
		Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
		Menú:
		1.- Introducir número entero.
		2.- Listar números.
		3.- Eliminar número.
		4.- Eliminar todos los números.
		5.- Salir. 
		*/
		
		GestionListado gestion;
		Scanner sc = new Scanner(System.in);
		int opcion, num;
		String menu;
		
		gestion = new GestionListado();
		menu = "\nMenú\n"
				+ "1.- Introducir número entero\n"
				+ "2.- Listar números\n"
				+ "3.- Eliminar número\n"
				+ "4.- Eliminar todos los números\n"
				+ "5.- Salir\n"
				+ "Introduce opción: ";
		do {
			System.out.println(menu);
			
			try {
				opcion = Integer.valueOf(sc.nextLine());
			
				switch(opcion) {
					case 1:
						System.out.println("\nIntroduce un número: ");
						num = Integer.valueOf(sc.nextLine());
						
						gestion.nuevo(num);
					break;
					
					case 2:
						gestion.listar();
					break;
					
					case 3:
						System.out.println("\nIntroduce un número: ");
						num = Integer.valueOf(sc.nextLine());
						
						gestion.eliminar(num);
					break;
					
					case 4: 					
						gestion.eliminar();
					break;
					
					case 5:
						System.out.println("FIN");
					break;
					
					default:
						System.out.println("Opción incorrecta");
					break;
				}	
			}	
			
			catch (Exception e) {
				opcion = 0;
				System.out.println("Opción incorrecta. Debes introducir un número");
			}
			
		} while (opcion != 5); 
		
		sc.close();
	}
}
