package Ejercicios_graficos;

import graphics.Rectangle;
import graphics.Color;
import graphics.Ellipse;

public class Semaforo_clase {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		
		caja = new Rectangle(10,10,60,110);
		caja.setColor(Color.BLACK);
		caja.draw();
		caja.fill();
		
		palo = new Rectangle(30,120,5,100);
		palo.draw();
		palo.fill();
		
		verde = new Ellipse(30,90,20,25);
		Color color_verde = new Color(0,200,0); // para crear un objeto que sea un color
		verde.setColor(color_verde);
		verde.draw(); 
		verde.fill();
		
		rojo = new Ellipse(30,55,20,25);
		Color color_rojo = new Color(255,255,0); 
		rojo.setColor(color_rojo);
		rojo.draw(); 
		rojo.fill();
		
		ambar = new Ellipse(30,20,20,25);
		Color color_ambar = new Color(255,0,0); 
		ambar.setColor(color_ambar);
		ambar.draw(); 
		ambar.fill();

	}

}
