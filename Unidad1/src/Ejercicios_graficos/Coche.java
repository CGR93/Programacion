package Ejercicios_graficos;

import java.lang.ProcessBuilder.Redirect;

import graphics.Canvas;
import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;

public class Coche {

	public static void main(String[] args) {
		Canvas.getInstance();
                       
        Rectangle carroceria = new Rectangle(200,400,200,50);
        carroceria.setColor(Color.BLACK);
        carroceria.draw();
        carroceria.fill();
        
        Ellipse rueda1 = new Ellipse(350,420,40,50);
        rueda1.setColor(Color.CYAN);
        rueda1.draw();
        rueda1.fill();
        
        Ellipse rueda2 = new Ellipse(350,420,40,50);
        rueda2.setColor(Color.CYAN);
        rueda2.draw();
        rueda2.fill();
        
        Ellipse rueda3 = new Ellipse(210,420,40,50);
        rueda3.setColor(Color.CYAN);
        rueda3.draw();
        rueda3.fill();
        
        Ellipse rueda4 = new Ellipse(210,420,40,50);
        rueda4.setColor(Color.CYAN);
        rueda4.draw();
        rueda4.fill();
        
        Line segment = new Line(390, 500, 450, 450);
        segment.setColor(Color.BLACK);
        segment.draw();
        Line segment2 = new Line(391, 501, 451, 451);
        segment2.setColor(Color.BLACK);
        segment2.draw();
        
	}

}
