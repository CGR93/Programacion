package Ejercicios_graficos;

import java.lang.ProcessBuilder.Redirect;

import graphics.Canvas;
import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;

public class Grafica {

	public static void main(String[] args) {
		Canvas.getInstance();
		
		Line coordenadasY = new Line(100,75,100,500);
		coordenadasY.draw();
		
		Line coordenadasX = new Line(100,500,500,500);
		coordenadasX.draw();
		
		Rectangle grafico = new Rectangle(125,250,50,250);
		grafico.setColor(Color.BLUE);
		grafico.draw();
		grafico.fill();

		Rectangle grafico1 = new Rectangle(200,200,50,300);
		grafico1.setColor(Color.RED);
		grafico1.draw();
		grafico1.fill();
		
		Rectangle grafico2 = new Rectangle(275,275,50,225);
		grafico2.setColor(Color.ORANGE);
		grafico2.draw();
		grafico2.fill();
		
		Rectangle grafico3 = new Rectangle(350,225,50,275);
		grafico3.setColor(Color.GREEN);
		grafico3.draw();
		grafico3.fill();
	}

}
