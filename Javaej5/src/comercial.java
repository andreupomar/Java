
final public class comercial extends empleado {

	//ATRIBUTOS
	private Integer ventasRealizadas;
	private Integer comisi�n;
	
	//GETTERS Y SETTERS
	public Integer getVentasRealizadas() {
		return ventasRealizadas;
	}



	public void setVentasRealizadas(Integer ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}



	public Integer getComisi�n() {
		return comisi�n;
	}



	public void setComisi�n(Integer comisi�n) {
		this.comisi�n = comisi�n;
	}


	//CONSTRUCTOR
	public comercial(String nombre, String apellido1, String apellido2, String nif, Integer edad, Integer salario, Integer ventasRealizadas, Integer comisi�n) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.ventasRealizadas = ventasRealizadas;
		this.comisi�n = comisi�n;
	}
	
	//CONSTRUCTOR COPIA (EN DESUSO)
	public comercial(comercial comercial1) {
		this.setNombre(comercial1.nombre);
		this.setApellido1(comercial1.apellido1);
		this.setApellido2(comercial1.apellido2);
		this.setNif(comercial1.nif);
		this.setEdad(comercial1.edad);
		this.setSalario(comercial1.salario);
	}
	
	
	
}
