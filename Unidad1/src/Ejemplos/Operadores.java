package Ejemplos;
import java.util.Scanner;
public class Operadores {

	public static void main(String[] args) {
		int X;
		int x;
		double Y; // double y float guarda numeros reales, int cualquier numero
		boolean variable;
		
		variable= 5 > (4 + 2);
		//
		boolean se_congela;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame la temperatura del agua: ");
		if (teclado.nextInt()<0) se_congela = true;
		else se_congela = false; 
		
		if (se_congela) System.out.println("pon la calefaccion.");
		else  System.out.println("pon el aire.");
		
		variable = 6 > 2 && 4 <= 7 ;
		teclado.close();
		//
		X = 2 + 2 * 6; // primero va la multiplicacion y despues la suma
		
		x = (34 + 4 / 3) + 5; //con los parentesis se hace primero lo del parentesis(primero la division) y luego lo de juera
		
		Y = X^3;
		
		// X++; incrementa uno
		// ++X; incrementa uno
		
		System.out.print("\nResultado de 5 > (4 + 2): "+ variable);
		System.out.print("\nEl resultado es: "+ X);
		System.out.print("\nEl resultado es: "+ x);
		System.out.print("\nEl resultado es: "+ Y);
	}

}
