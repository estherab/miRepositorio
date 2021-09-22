package paquete;

import java.util.Calendar;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
		11. Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
		como nombre de alumno 'fin'. En ese momento mostrará la edad media de los alumnos y
		el nombre del alumno menor. NOTA: Al introducir como nombre 'fin', no nos ha de pedir el
		años de nacimiento.
		*/
		
		Scanner sc = new Scanner(System.in);
		String nombre, nombreMenor = "";
		int anoNacimiento, suma = 0, i = 0, edad, edadMenor = Integer.MAX_VALUE;
		
		Calendar cal= Calendar.getInstance();
		int anoActual = cal.get(Calendar.YEAR);
		
		System.out.print("Nombre: ");
		nombre = sc.next();
		
		while (!nombre.equals("fin")) {
			System.out.print("A�o nacimiento: ");
			anoNacimiento = sc.nextInt();
			
			i++;
			edad = anoActual - anoNacimiento;
			suma += edad;
				 
			if (edad < edadMenor) {
				nombreMenor = nombre;
				edadMenor = edad;
			}
				
			System.out.print("Nombre: ");
			nombre = sc.next();	
		}	
		
		if (i > 0) {
			System.out.println("Edad media: " + (float)suma/i);
			System.out.println("Nombre menor: " + nombreMenor);
		} 
		
		sc.close();
	}
}
