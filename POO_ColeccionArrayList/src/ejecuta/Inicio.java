package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Movil> moviles = new ArrayList<Movil>();
		
		Movil movilJuan = new Movil(111, 4, "Iphone", 4);
		Movil movilMaria = new Movil(222, 6, "Samsung", 5);
		Movil movilPedro = new Movil(333, 8, "Huawei", 4);
		
		Movil movilBusqueda;
		
		moviles.add(movilJuan);
		moviles.add(movilMaria);
		moviles.add(movilPedro);
		
		int imei;
		
		System.out.println("CONTENIDO DEL ARRAYLIST");
		
		for (Movil movil : moviles)
			System.out.println(movil);
		
		System.out.println("Introduce imei a buscar: ");
		imei = sc.nextInt();
		
		movilBusqueda = new Movil();
		movilBusqueda.setImei(imei);
		
		if (moviles.contains(movilBusqueda))
			System.out.println("ENCONTRADO");
		
		else
			System.out.println("NO ENCONTRADO");
		
		sc.close();
	}
}
