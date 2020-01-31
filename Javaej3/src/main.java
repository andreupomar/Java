import java.util.Scanner;
import java.util.ArrayList;


public class main {
	
	public static void mostrarLista(ArrayList<Cuenta> ListaCuentas) {
		System.out.println("Estas son todas las cuentas existentes: ");
		System.out.println("");
		System.out.println("ID     Nombre          Número de cuenta");
		
		for (int i = 0; i < ListaCuentas.size(); i++) {
			System.out.println(i+"   "+ListaCuentas.get(i).getNombre()+"   "+ListaCuentas.get(i).getNumCuenta());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cuenta> ListaCuentas = new ArrayList<Cuenta>();
		boolean menu = true;
		
		while (menu == true) {
			Scanner entrada = new Scanner (System.in);
			
			System.out.println("Programa de cajero automático");
			System.out.println("");
			System.out.println("1) Crear cuenta");
			System.out.println("2) Ingresar dinero");
			System.out.println("3) Retirar dinero");
			System.out.println("4) Transferir dinero");
			System.out.println("*) Salir");
			System.out.println("");
			System.out.println("Por favor, introduzca un número: ");
			
			int seleccion = entrada.nextInt();
			
			switch (seleccion) {
			case 1:
				Cuenta c1 = new Cuenta();
				c1.crearCuenta();
				ListaCuentas.add(c1);
				break;
			
			case 2:
				mostrarLista(ListaCuentas);
				System.out.println("");
				System.out.println("Introduzca el ID de la cuenta: ");
				
				int ID = entrada.nextInt();
				ListaCuentas.get(ID).ingresarDinero();
				
			}
		}
	}

}
