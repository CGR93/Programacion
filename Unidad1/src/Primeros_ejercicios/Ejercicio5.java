package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	

	public static void main(String[] args) {
		// Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.

		double tamaño, velocidad;
		double tiempo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el tamaño del archivo en Mbytes: ");
		tamaño = teclado.nextDouble(); //nextDouble por la variable
		System.out.print("Escribe la velocidad de la linea de datos del ordenador: ");
		velocidad = teclado.nextDouble(); // nextDouble por la variable
		
		tiempo = (tamaño * 8) / velocidad; // 1Mbytes = 8Mbites; Mbps = Mbites por segundo
		
		System.out.print("El tiempo que tarda en transmitir el archivo es: "+ tiempo);
		
		teclado.close();
			}
}
