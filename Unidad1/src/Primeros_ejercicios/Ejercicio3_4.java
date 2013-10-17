package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_4 {

	public static void main(String[] args) {
		// Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
		double x1, x2, y1, y2 ;
		double altura, base ;
		double area;
		
		Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
		System.out.print("Las coordenadas del rectangulo : ");
		x1 = teclado.nextFloat();
		x2 = teclado.nextFloat();
		y1 = teclado.nextFloat();
		y2 = teclado.nextFloat();
		altura = y2 - y1;
		base = x2 - x1;
		area = (altura * base);
		System.out.println("El area es :"+ area);
		teclado.close(); //para finalizar el teclado y que no de aviso
			}
}
