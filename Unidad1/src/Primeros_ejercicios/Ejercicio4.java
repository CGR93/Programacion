package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crea un programa que pida un peso en Kilogramos y realice la conversi�n a onzas, sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)
        float peso;
        double onzas;
        Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
	System.out.print("N�mero en Kg a convertir en Onzas: ");
	peso = teclado.nextFloat();
	onzas = peso * 35.2739619;
	System.out.println("El n�mero en Onzas es: "+ onzas);
	teclado.close();
		}

}
