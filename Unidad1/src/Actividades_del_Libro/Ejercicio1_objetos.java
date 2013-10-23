package Actividades_del_Libro;

import java.util.Scanner;

public class Ejercicio1_objetos {

	public static void main(String[] args) {
	String alumno1, alumno2, alumno3;
	int edad;
	
	Scanner teclado = new Scanner(System.in);
	System.out.print("Dime tu nombre: ");
	alumno1 = teclado.next();
	System.out.print("Dime tu edad: ");
	edad = teclado.nextInt();
	System.out.print("Dime tu nombre: ");
	alumno2 = teclado.next();
	System.out.print("Dime tu nombre: ");
	alumno3 = teclado.next();
			
	System.out.println("El alumno es "+ alumno1 + " y su edad es: "+ edad);
	System.out.println("El alumno es "+ alumno2 + " y su edad es: "+ edad);
	System.out.println("El alumno es"+ alumno3 + " y su edad es: "+ edad);
	
	teclado.close();
	
		
	}

}
