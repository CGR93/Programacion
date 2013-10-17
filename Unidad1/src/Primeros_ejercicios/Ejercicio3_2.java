package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		//Calcular el perímetro y área de un círculo dado su radio.
		float radio;
		double perimetro;
		double area;
		
		Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
		System.out.print("El radio del circulo: "); 
		//ir a la consola, poner la radio y pulsar el intro para ejecutarlo
		//con numeros decimales poner , (4,5)
		radio = teclado.nextFloat(); //esto es para escribir el radio de la cicunferencia
		area = (Math.PI * radio); //para hacer el area
		perimetro = (2 * Math.PI * Math.pow(radio, 2)); //para hacer el perimetro
		System.out.println("El perimetro es :"+ perimetro);
		System.out.println("El area es :"+ area);
		teclado.close(); //para finalizar el teclado y que no de aviso
			}

}
