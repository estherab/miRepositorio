package clases;

import java.util.ArrayList;

import interfaces.IGestionListado;

public class GestionListado implements IGestionListado {
	public ArrayList<Integer> listado;
	public static final int MAX = 18;
	
	public GestionListado() {
		this.listado = new ArrayList<Integer>();
	}
	
	@Override
	public void nuevo(int numero) {
		
		if (this.listado.size() == MAX)
			System.out.println("Número no introducido. El listado está lleno");
		
		else if (this.listado.contains(numero))
			System.out.println("Número no introducido. Ya está en el listado");
		
		else {
			this.listado.add(numero);
			this.listado.sort(null);
			System.out.println("Número introducido");
		}			
	}

	@Override
	public void listar() {
		
		if (this.listado.size() == 0)
			System.out.println("Listado vacío");
		
		else {
			System.out.println("\nContenido del listado");
			for (int i = 0; i < this.listado.size(); i++)
				System.out.println(this.listado.get(i) + " ");
		}
	}

	@Override
	public void eliminar(Integer numero) {
		
		if (!this.listado.remove(numero))
			System.out.println("No se ha eliminado. El elemento no está en el listado");
	}

	@Override
	public void eliminar() {

		this.listado.clear();	
		System.out.println("Listado eliminado");
	}
}
