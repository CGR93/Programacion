package Primeros_ejercicios;

//Entrada basica con un cuadro de dialogo
import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		//pide al usuario que escriba su nombre
		String nombre = 
		  JOptionPane.showInputDialog("Cual es su nombre");
		//crear el mensaje
		String mensaje=
		  String.format("Bienvenido, %s, a la programacion en Java", nombre); 
		//%s para que aparezca en su lugar lo que pongas al final en este caso la variable nombre
		//muestra el mensaje para dar la bienvenida al usuario
				JOptionPane.showMessageDialog(null, mensaje);
	}

}

