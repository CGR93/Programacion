package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		// Calcular el volumen de una esfera dado su radio.
		int radio ; 
		double volumen;
		
		Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
		
		System.out.print("El radio del circulo: "); 
		//ir a la consola, poner la radio y pulsar el intro para ejecutarlo
		//con numeros decimales poner , (4,5)
		radio = teclado.nextInt(); //esto es para escribir el radio de la cicunferencia
		volumen = (4 * Math.PI * Math.pow(radio,3)) / 3 ; // volumen de la circunferencia
		System.out.println("El volumen es: "+ volumen);// Math.round() es para que no aparezcan decimales
		
		teclado.close(); //para finalizar el teclado y que no de aviso
	}

}
