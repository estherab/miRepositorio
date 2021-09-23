package clases;

public class Curso {
	private String denominacion;
	private int horas;
	private String academia;
	
	public Curso() {
		/*this.denominacion = "";
		this.horas = 0;
		this.academia = "";
		*/
		
		setDenominacion(denominacion);
		setHoras(horas);
		setAcademia(academia);
	}
	
	public Curso(String denominacion, int horas, String academia) {
		/* this.denominacion = denominacion;
		this.horas = horas;
		this.academia = academia; */
		
		setDenominacion(denominacion);
		setHoras(horas);
		setAcademia(academia);
	}
	
	public String getDenominacion() {
		
		if (this.denominacion.equals(""))
			return "Sin denominación";
		
		else
			return this.denominacion.toUpperCase();
	}
	
	public int getHoras() {
		
		return this.horas;
	}
	
	public String getAcademia() {
		
		return this.academia;
	}
	
	public void setDenominacion(String denominacion) {
		
		this.denominacion = denominacion;
	}
	
	public void setHoras(int horas) {
		
		if (horas < 0)
			System.out.println("Valor incorrecto. Las horas no pueden ser negativo");
		
		else
			this.horas = horas;
	}
	
	public void setAcademia(String academia) {
		
		this.academia = academia;
	}	
}
