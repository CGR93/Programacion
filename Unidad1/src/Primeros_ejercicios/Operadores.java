package Primeros_ejercicios;

public class Operadores {

	public static void main(String[] args) {
		int X;
		int x;
		double Y; // double y float guarda numeros reales, int cualquier numero
		
		X = 2 + 2 * 6; // primero va la multiplicacion y despues la suma
		
		x = (34 + 4 / 3) + 5; //con los parentesis se hace primero lo del parentesis(primero la division) y luego lo de juera
		
		Y = X^3;
		
		// X++; incrementa uno
		// ++X; incrementa uno
		
		System.out.print("El resultado es: "+ X);
		System.out.print("\nEl resultado es: "+ x);
		System.out.print("\nEl resultado es: "+ Y);
	}

}
