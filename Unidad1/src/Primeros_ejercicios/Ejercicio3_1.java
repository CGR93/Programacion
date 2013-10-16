package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		//Calculen el perímetro y área de un rectángulo dada su base y su altura.
		float altura, base;
		float perimetro;
		float area;
		
		Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
		
		System.out.print("Dame la altura y la base: "); 
		//ir a la consola, poner los dos numeros y pulsar el intro para ejecutarlo
		//con numeros decimales poner , (4,5)
		altura = teclado.nextFloat(); //esto es para escribir el primer numero
		base = teclado.nextFloat(); //esto es para escribir el segundo numero
		perimetro = (altura + base) * 2; //para hacer el perimetro
		area = (altura * base); //para hacer el area
		System.out.println("La altura es:"+ altura);
		System.out.println("La base es :"+ base);
		System.out.println("El perimetro es :"+ perimetro);
		System.out.println("El area es :"+ area);
		teclado.close(); //para finalizar el teclado y que no de aviso
	}

}
