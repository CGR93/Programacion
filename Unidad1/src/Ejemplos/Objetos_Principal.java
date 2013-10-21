package Ejemplos;

public class Objetos_Principal {

	public static void main(String[] args) {
		Clase1 objeto;
		
		
		objeto = new Clase1();
		objeto.mensaje();
		
		
		Alumno Juan, Pedro;
		Juan = new Alumno();
		Pedro = new Alumno();
		
		Juan.nombre = "Juan";
		Pedro.nombre = "Pedro";
		
		Juan.mensaje();
		Pedro.mensaje();
	}

}
