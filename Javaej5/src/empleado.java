import java.util.ArrayList;

public class empleado {
	//ATRIBUTOS
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String nif;
	protected Integer edad;
	protected Integer salario;
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getSalario() {
		return salario;
	}
	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	
	//CONSTRUCTOR
	public empleado(String nombre, String apellido1, String apellido2, String nif, Integer edad, Integer salario) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nif = nif;
		this.edad = edad;
		this.salario = salario;
	}
	
	//CONSTRUCTOR COPIA (EN DESUSO)
	public empleado (empleado empleado1) {
		this.setNombre(empleado1.nombre);
		this.setApellido1(empleado1.apellido1);
		this.setApellido2(empleado1.apellido2);
		this.setNif(empleado1.nif);
		this.setEdad(empleado1.edad);
		this.setSalario(empleado1.salario);
	}
	
	public empleado() { //CONSTRUCTOR VACÍO
		//APARENTEMENTE LO NECESITO PARA LOS CONSTRUCTORES COPIA DE LOS HIJOS
	}
	
}
