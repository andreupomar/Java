import java.util.ArrayList;
import java.util.Scanner;
public class Pelicula {
	//ATRIBUTOS
	private int identificador;
	private String titulo;
	private String director;
	private float duracion;
	private String genero;
	private int a�o;
	private boolean disponibilidad;
	private int cantidad;
	private int reservadas;
	
	static Scanner entrada = new Scanner (System.in);
	
	//GETTERS Y SETTERS
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getReservadas() {
		return reservadas;
	}

	public void setReservadas(int reservadas) {
		this.reservadas = reservadas;
	}

	
	//CONSTRUCTOR
	public Pelicula(int identificador, String titulo, String director, float duracion, String genero, int a�o,
			boolean disponibilidad, int cantidad, int reservadas) {
		this.identificador = identificador;
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.a�o = a�o;
		this.disponibilidad = disponibilidad;
		this.cantidad = cantidad;
		this.reservadas = reservadas;
	}
	
	public Pelicula() {} //Constructor vac�o, que utilizaremos posteriormente con A�adirPel�cula()

	
	public void a�adirPel�cula(int contador, int copias) { //Genera una pel�cula, para posteriormente a�adirla al array
		System.out.println("�Cu�ntas copias va a a�adir?");
		int cantidad = entrada.nextInt();
		
		if (cantidad + copias <= 3000 && cantidad > 0) {
			System.out.println("Introduzca el t�tulo de la pel�cula que desea a�adir:");
			this.setTitulo(entrada.nextLine());
			System.out.println("Introduzca el director de la pel�cula: ");
			this.setDirector(entrada.nextLine());
			System.out.println("Introduzca la duraci�n, en minutos: ");
			this.setDuracion(entrada.nextFloat());
			System.out.println("Introduzca el g�nero de la pel�cula: ");
			this.setGenero(entrada.nextLine());
			System.out.println("Introduzca el a�o de la pel�cula, en n�meros: ");
			this.setA�o(entrada.nextInt());
			this.setCantidad(cantidad);
			this.setReservadas(0);
			this.setIdentificador(contador);
			this.setDisponibilidad(true);
			System.out.println("Se ha introducido "+this.getTitulo()+" con el identificador "+this.getIdentificador()+" y "+this.getCantidad()+" copias.");
		}
		else if (cantidad <= 0) {
			System.out.println("No pueden introducirse copias iguales o inferiores a 0.");
		}
		else {
			System.out.println("No hay espacio suficiente, la capacidad restante para copias es: "+(3000-cantidad));
		}
	}
	
	public static void listarCat�logo(ArrayList<Pelicula> Catalogo) { 
		String estado = "";
		for (int i = 0; i< Catalogo.size(); i++) { //Recorre el array
			if (Catalogo.get(i).isDisponibilidad() == true) { //Si est� disponible, cambia "estado" a disponible
				estado = "DISPONIBLE";
			}
			else {
				estado = "NO DISPONIBLE";
			}
			System.out.println("ID: "+Catalogo.get(i).getIdentificador()+" T�tulo: "+Catalogo.get(i).getTitulo()+"   Director: "+Catalogo.get(i).getDirector()+"  G�nero: "+Catalogo.get(i).getGenero()+"  Duraci�n: "+Catalogo.get(i).getDuracion()+" "+estado);
			
			}
		}		
	
}

