package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		// Calcular el volumen de una esfera dado su radio.
		float radio;
		double volumen;
		
		Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
		
		System.out.print("El radio del circulo: "); 
		//ir a la consola, poner la radio y pulsar el intro para ejecutarlo
		//con numeros decimales poner , (4,5)
		radio = teclado.nextFloat(); //esto es para escribir el radio de la cicunferencia
		radio = radio * radio * radio;
		volumen = (4 * Math.PI * radio ) / 3; // volumen de la circunferencia
		System.out.println("El volumen es: "+ volumen);
		teclado.close(); //para finalizar el teclado y que no de aviso
	}

}
