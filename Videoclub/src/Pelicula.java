import java.util.ArrayList;
import java.util.Scanner;
public class Pelicula {
	//ATRIBUTOS
	private int identificador;
	private String titulo;
	private String director;
	private float duracion;
	private String genero;
	private int año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
	public Pelicula(int identificador, String titulo, String director, float duracion, String genero, int año,
			boolean disponibilidad, int cantidad, int reservadas) {
		this.identificador = identificador;
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.año = año;
		this.disponibilidad = disponibilidad;
		this.cantidad = cantidad;
		this.reservadas = reservadas;
	}
	
	public Pelicula() {} //Constructor vacío, que utilizaremos posteriormente con AñadirPelícula()

	
	public void añadirPelícula(int contador, int copias) { //Genera una película, para posteriormente añadirla al array
		System.out.println("¿Cuántas copias va a añadir?");
		int cantidad = entrada.nextInt();
		
		if (cantidad + copias <= 3000 && cantidad > 0) {
			System.out.println("Introduzca el título de la película que desea añadir:");
			this.setTitulo(entrada.nextLine());
			System.out.println("Introduzca el director de la película: ");
			this.setDirector(entrada.nextLine());
			System.out.println("Introduzca la duración, en minutos: ");
			this.setDuracion(entrada.nextFloat());
			System.out.println("Introduzca el género de la película: ");
			this.setGenero(entrada.nextLine());
			System.out.println("Introduzca el año de la película, en números: ");
			this.setAño(entrada.nextInt());
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
	
	public static void listarCatálogo(ArrayList<Pelicula> Catalogo) { 
		String estado = "";
		for (int i = 0; i< Catalogo.size(); i++) { //Recorre el array
			if (Catalogo.get(i).isDisponibilidad() == true) { //Si está disponible, cambia "estado" a disponible
				estado = "DISPONIBLE";
			}
			else {
				estado = "NO DISPONIBLE";
			}
			System.out.println("ID: "+Catalogo.get(i).getIdentificador()+" Título: "+Catalogo.get(i).getTitulo()+"   Director: "+Catalogo.get(i).getDirector()+"  Género: "+Catalogo.get(i).getGenero()+"  Duración: "+Catalogo.get(i).getDuracion()+" "+estado);
			
			}
		}		
	
}

