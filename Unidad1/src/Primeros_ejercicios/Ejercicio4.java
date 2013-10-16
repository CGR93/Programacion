package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crea un programa que pida un peso en Kilogramos y realice la conversión a onzas, sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)
        float peso;
        double onzas;
        Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
	System.out.print("Número en Kg a convertir en Onzas: ");
	peso = teclado.nextFloat();
	onzas = peso * 35.2739619;
	System.out.println("El número en Onzas es: "+ onzas);
	teclado.close();
		}

}
