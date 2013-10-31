package Ejercicios_graficos;

import graphics.Rectangle;
import graphics.Color;
import graphics.Ellipse;

public class Semaforo_clase {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		int ancho, altura, centro_x, centro_y, diametro_disco;
		
		//Inicializamos los valores de dibujo delsemaforo
		ancho = 150;
		altura = 300;
		centro_x = 300;
		centro_y = 300;
		diametro_disco = ancho/2;
		
		
				
		
		caja = new Rectangle(centro_x-ancho/2,centro_y-altura/2,ancho,altura);
		caja.setColor(Color.BLACK);
		caja.draw();
		caja.fill();
		
		palo = new Rectangle(centro_x-ancho/10,centro_y+altura/2,ancho/5,altura);
		palo.draw();
		palo.fill();
		
		verde = new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco+145,diametro_disco,diametro_disco);
		Color color_verde = new Color(0,200,0); // para crear un objeto que sea un color
		verde.setColor(color_verde);
		verde.draw(); 
		verde.fill();
		
		ambar = new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco/2,diametro_disco,diametro_disco);
		Color color_ambar = new Color(255,255,0); 
		ambar.setColor(color_ambar);
		ambar.draw(); 
		ambar.fill();
		
		rojo = new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco*2+5,diametro_disco,diametro_disco);
		Color color_rojo = new Color(255,0,0); 
		rojo.setColor(color_rojo);
		rojo.draw(); 
		rojo.fill();

	}

}
