package Ejercicios_graficos;

import java.lang.ProcessBuilder.Redirect;

import graphics.Canvas;
import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;

public class Semaforo {

	public static void main(String[] args) {
		Canvas.getInstance();
		
		Rectangle rectangulo = new Rectangle(50,25,100,450);
		rectangulo.setColor(Color.GRAY);
		rectangulo.draw();
		rectangulo.fill();
		
		Ellipse colorRojo = new Ellipse(80,50,100,100);
		colorRojo.setColor(Color.RED);
        colorRojo.fill();
                
        Ellipse colorNaranja = new Ellipse(80,170,100,100);
		colorNaranja.setColor(Color.ORANGE);
        colorNaranja.fill();
        
        Ellipse colorVerde = new Ellipse(80, 290, 100, 100);
        colorVerde.setColor(Color.GREEN);
        colorVerde.fill();    		
	}

}
