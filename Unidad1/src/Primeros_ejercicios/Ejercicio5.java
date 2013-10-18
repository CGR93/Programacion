package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	

	public static void main(String[] args) {
		// Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.

		double tamaño, velocidad;
			
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el tamaño del archivo en Mbytes: ");
		tamaño = teclado.nextDouble(); //nextDouble por la variable
		System.out.print("Escribe la velocidad de la linea de datos del ordenador en Mbps: ");
		velocidad = teclado.nextDouble(); // nextDouble por la variable
		
		tamaño = tamaño * 1024 * 1024 * 8 ; // = tamaño * Math.pow(2,20) * 8
		velocidad = velocidad * 1000000;
				
		System.out.print("Datos: "+ tamaño + " bits");
		System.out.print("\nVelocidad: "+ velocidad + " bps");// \n para poner un intro
		System.out.print("\nTiempo para transmitir: "+ tamaño/velocidad + " segundos"); //\ para introducir un intro
		teclado.close();		
	}
}
