package ejecuta;

import clases.Curso;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso java = new Curso();
		
		java.setDenominacion("Beca Java");
		java.setHoras(-10);
		java.setAcademia("Experis");
		
		System.out.println(java.getDenominacion());
		System.out.println(java.getHoras());
		System.out.println(java.getAcademia());		
		
		Curso git = new Curso("Git", 10, "Experis");
		
		System.out.println(git.getDenominacion());
		System.out.println(git.getHoras());
		System.out.println(git.getAcademia());	
	}
}
