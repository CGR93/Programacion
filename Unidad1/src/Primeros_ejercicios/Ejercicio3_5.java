package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_5 {

	public static void main(String[] args) {
		// Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
		float cateto1, cateto2; 
		double hipotenusa;
		Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo

System.out.print("Dame los dos catetos: ");
        cateto1 = teclado.nextFloat(); //esto es para escribir el primer numero
		cateto2 = teclado.nextFloat(); //esto es para escribir el segundo numero
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		// Math.sqrt es para la raiz cuadrada y Math.pow es para elevear un numero a otro ( El primer numerito es la base y el segundo es el exponente)
		System.out.println("La hipotenusa del triangulo rectangulo es: "+ hipotenusa);
		teclado.close();
			}

}
