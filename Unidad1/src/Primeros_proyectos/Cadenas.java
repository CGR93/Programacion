package Primeros_proyectos;
//Importar el scanner para poder usarlo
import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
     	Scanner teclado = new Scanner(System.in);//declarar el scanner pero es necesario importarlo
		
		String nombre; //te permite guardar un texto
		
		nombre = teclado.nextLine();
		
		System.out.println("Hola "+ nombre); //en la consola pones tu nombre y aparece
		
		teclado.close(); //para finalizar el teclado y que no de aviso
	}

}
