package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	

	public static void main(String[] args) {
		// Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una l�nea de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.

		double tama�o, velocidad;
		double tiempo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el tama�o del archivo en Mbytes: ");
		tama�o = teclado.nextDouble(); //nextDouble por la variable
		System.out.print("Escribe la velocidad de la linea de datos del ordenador: ");
		velocidad = teclado.nextDouble(); // nextDouble por la variable
		
		tiempo = (tama�o * 8) / velocidad; // 1Mbytes = 8Mbites; Mbps = Mbites por segundo
		
		System.out.print("El tiempo que tarda en transmitir el archivo es: "+ tiempo);
		
		teclado.close();
			}
}
