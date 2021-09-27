package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Programa consistente en un juego en el que el Jugador1 introduce un n�mero entre el 1 y
		   el 100 y el Jugador2 tendr� que adivinarlo en un m�ximo de 10 intentos. Por cada intento
           del Jugador2, y en el caso de no acertar, se mostrar� el mensaje �Te pasaste�, o �No
           llegaste�, seg�n corresponda. De la misma manera, y al terminar el programa, se
           mostrar�n los mensajes �Acertaste� o bien �Intentos agotados�.
		 */
		
		int numAdivinar, i = 1, intento;
		boolean acertado = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Jugador 1 - N� a adivinar (entre 1 y 100): ");
		numAdivinar = sc.nextInt();
		
		while (numAdivinar < 1 || numAdivinar > 100) {
			System.out.println("N�mero fuera de rango.");
			System.out.print("Jugador 1 - N� a adivinar (entre 1 y 100): ");
			numAdivinar = sc.nextInt();
		}
		
		while (i <= 10 && !acertado) {
			System.out.print("Jugador 2 - intento n� " + i + ": ");
			intento = sc.nextInt();
			
			if (intento < numAdivinar) {
				System.out.println("No llegaste");
				i++;
			}
			
			else if (intento > numAdivinar) {
				System.out.println("Te pasaste");
				i++;
			}
			
			else {
				System.out.println("Acertaste");
				acertado = true;
			}
		}
		
		if (i == 11 && !acertado)
			System.out.println("Intentos agotados");
		
		sc.close();
	}
}
