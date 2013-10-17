package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio1_otra_forma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String mensaje;
		Scanner input;
		
		input = new Scanner(System.in);
		System.out.println("¿Como te llamas?");
		
		nombre = input.nextLine();
		mensaje = "Hola,"+ nombre;
		System.out.println(nombre);
		input.close();
		
	}

}
