package Primeros_ejercicios;
//Importar el scanner para poder usarlo
import java.util.Scanner;

public class Ejercicio2_de_otra_forma {

	public static void main(String[] args) {
		float numero1, numero2;
		float media, suma, producto; 
		Scanner teclado = new Scanner(System.in); //declarar el scanner pero es necesario importarlo
		
		System.out.print("Dame los dos numero: "); 
		//ir a la consola, poner los dos numeros y pulsar el intro para ejecutarlo
		//con numeros decimales poner (4,5)
		numero1 = teclado.nextFloat(); //esto es para escribir el primer numero
		numero2 = teclado.nextFloat(); //esto es para escribir el segundo numero
		
		suma = (numero1 + numero2); // para hacer la suma
		producto = (numero1 * numero2); // para hacer el producto
		media = (numero1 + numero2) / 2; //para hacer la media de dos numeros
		
		System.out.println("Numero 1: "+ numero1);
		System.out.println("Numero 2 :"+ numero2);
		System.out.println("La media es :"+ media);
		System.out.println("La suma es :"+ suma);
		System.out.println("La producto es: "+ producto);
		
		teclado.close(); //para finalizar el teclado y que no de aviso
	}
	

}
