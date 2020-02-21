import java.util.ArrayList;
import java.util.Scanner;
public class Pelicula {
	//ATRIBUTOS
	private Integer identificador;
	private String titulo;
	private String director;
	private float duracion;
	private String genero;
	private Integer año;
	private boolean disponibilidad;
	private int cantidad;
	private int reservadas;
	
	static Scanner entrada = new Scanner (System.in);
	
	//GETTERS Y SETTERS
	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
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

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
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
	
	public static boolean listarCatálogo(ArrayList<Pelicula> Catalogo) { 
		String estado = "";
		boolean exito = true; //Asumimos que tendrá éxito
		if (Catalogo.size() > 0) { //Comprobamos el tamaño del arraylist para ver que no está vacío
			for (int i = 0; i< Catalogo.size(); i++) { //Recorre el array
				estado = cambiarEstado(Catalogo, i);	
				System.out.println("ID: "+Catalogo.get(i).getIdentificador()+" Título: "+Catalogo.get(i).getTitulo()+"   Director: "+Catalogo.get(i).getDirector()+"  Género: "+Catalogo.get(i).getGenero()+"  Duración: "+Catalogo.get(i).getDuracion()+" "+estado);
			}
		}		
		else { //Si está vacío, nos saltamos el for y printeamos un mensaje de error
			System.out.println("No se han encontrado películas en el catálogo.");
			exito = false;
		}
		return exito;
	}
	
	public static void buscarMenú(ArrayList<Pelicula> Catalogo) {
		
		int select = 1;
		while (select > 0 || select < 6) { //Bucle principal, si introducimos una opción inválida saldrá
			System.out.println("¿Por qué parámetro desea buscar?");
			System.out.println("1 - ID");
			System.out.println("2 - Título");
			System.out.println("3 - Director");
			System.out.println("4 - Año");
			System.out.println("5 - Género");
			System.out.println("*) - Salir");
			select = entrada.nextInt(); 
		
			buscarLógica(Catalogo, select); 
		}
	
	}
	
	public static String cambiarEstado(ArrayList<Pelicula> Catalogo, int i) { //Cambia el estado de las películas al printear el catálogo
		String estado = "";
		if (Catalogo.get(i).isDisponibilidad() == true) {
			estado = "DISPONIBLE";
		}
		else {
			estado = "NO DISPONIBLE";
		}
		return estado;
	}
	
	public static void buscarLógica(ArrayList<Pelicula> Catalogo, int select) {
		System.out.println("Por favor, introduzca el parámetro a buscar");
		String query = entrada.nextLine();
		String estado = ""; //para no printear TRUE
		
		for (int i = 0; i > Catalogo.size(); i++) {
			if (select == 1) {
				if (Catalogo.get(i).getIdentificador().toString().contains(query) == true) { //Si el ID de i convertido a string contiene la query:
					estado = cambiarEstado(Catalogo, i);
					System.out.println("ID: "+Catalogo.get(i).getIdentificador()+" Título: "+Catalogo.get(i).getTitulo()+"   Director: "+Catalogo.get(i).getDirector()+"  Género: "+Catalogo.get(i).getGenero()+"  Duración: "+Catalogo.get(i).getDuracion()+" "+estado);
				}
			}
			
			else if (select == 2) {
				if (Catalogo.get(i).getTitulo().contains(query) == true) {
					estado = cambiarEstado(Catalogo, i);
					System.out.println("ID: "+Catalogo.get(i).getIdentificador()+" Título: "+Catalogo.get(i).getTitulo()+"   Director: "+Catalogo.get(i).getDirector()+"  Género: "+Catalogo.get(i).getGenero()+"  Duración: "+Catalogo.get(i).getDuracion()+" "+estado);
				}
			}
			
			else if (select == 3) {
				if (Catalogo.get(i).getDirector().contains(query) == true) {
					estado = cambiarEstado(Catalogo, i);
				}
			}
			
			else if (select == 4) {
				if (Catalogo.get(i).getAño().toString().contains(query) == true) {
					estado = cambiarEstado(Catalogo, i);
					System.out.println("ID: "+Catalogo.get(i).getIdentificador()+" Título: "+Catalogo.get(i).getTitulo()+"   Director: "+Catalogo.get(i).getDirector()+"  Género: "+Catalogo.get(i).getGenero()+"  Duración: "+Catalogo.get(i).getDuracion()+" "+estado);
				}
			}
			
			else {
				if (Catalogo.get(i).getDirector().contains(query) == true) {
					estado = cambiarEstado(Catalogo, i);
					System.out.println("ID: "+Catalogo.get(i).getIdentificador()+" Título: "+Catalogo.get(i).getTitulo()+"   Director: "+Catalogo.get(i).getDirector()+"  Género: "+Catalogo.get(i).getGenero()+"  Duración: "+Catalogo.get(i).getDuracion()+" "+estado);
				}
			}
		}
		
	}

	public static void reservarPelicula(ArrayList<Pelicula> Catalogo) {
		System.out.println("Introduzca la ID de la película que desea reservar");
		int reserva = entrada.nextInt();
		
		int restantes = Catalogo.get(reserva).getCantidad() - Catalogo.get(reserva).getReservadas();
		System.out.println(Catalogo.get(reserva).getTitulo()+" ("+Catalogo.get(reserva).getAño()+")");
		System.out.println("Copias restantes: "+restantes);
		
		System.out.println("Introduzca la cantidad de copias a reservar");
		int copias = entrada.nextInt();
		
		if (copias <= restantes) {
			Catalogo.get(reserva).setReservadas(Catalogo.get(reserva).getReservadas()+copias); //Añade las copias a las ya reservadas
			if (Catalogo.get(reserva).getCantidad() == Catalogo.get(reserva).getReservadas()) { //Comprobamos si nos hemos quedado sin copias
				Catalogo.get(reserva).setDisponibilidad(false); //Y Cambiamos la disponibilidad
			}
		}
		
		else {
			System.out.println("ERROR: No quedan tantas películas");
		}
	}
}
