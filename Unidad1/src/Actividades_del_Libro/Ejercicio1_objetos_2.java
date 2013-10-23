package Actividades_del_Libro;

import java.util.Scanner;

public class Ejercicio1_objetos_2 {

	public static void main(String[] args) {
		String alumno1, alumno2, alumno3;
		int edad1, edad2, edad3;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime tu nombre: ");
		alumno1 = teclado.next();
		System.out.print("Dime tu edad: ");
		edad1 = teclado.nextInt();
		System.out.print("Dime tu nombre: ");
		alumno2 = teclado.next();
		System.out.print("Dime tu edad: ");
		edad2 = teclado.nextInt();
		System.out.print("Dime tu nombre: ");
		alumno3 = teclado.next();
		System.out.print("Dime tu edad: ");
		edad3 = teclado.nextInt();
		
		media = (edad1 + edad2 + edad3) / 3;
		
				
		System.out.println("El alumno es "+ alumno1 + " y su edad es: "+ edad1);
		System.out.println("El alumno es "+ alumno2 + " y su edad es: "+ edad2);
		System.out.println("El alumno es "+ alumno3 + " y su edad es: "+ edad3);
		System.out.println("La edad media es: "+ media);
		
		teclado.close();

	}

}
