package Ejercicios_graficos;

import java.lang.ProcessBuilder.Redirect;

import graphics.Canvas;
import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Coche {

	public static void main(String[] args) throws InterruptedException {
		Canvas.getInstance();
                       
       Rectangle carroceria = new Rectangle(500,450,200,50);
       carroceria.setColor(Color.BLACK);
       carroceria.draw();
       carroceria.fill();
       
       Rectangle carroceria1 = new Rectangle(555,420,100,40);
       carroceria1.setColor(Color.BLACK);
       carroceria1.draw();
       carroceria1.fill();
       
       Rectangle ventana = new Rectangle(560,425,30,25);
       ventana.setColor(Color.GREEN);
       ventana.draw();
       ventana.fill();
       
       Rectangle ventana1 = new Rectangle(618,425,30,25);
       ventana1.setColor(Color.GREEN);
       ventana1.draw();
       ventana1.fill();
       
       Rectangle luz = new Rectangle(500,455,15,15);
       luz.setColor(Color.YELLOW);
       luz.draw();
       luz.fill();
       
       Rectangle luz1 = new Rectangle(685,455,15,15);
       luz1.setColor(Color.RED);
       luz1.draw();
       luz1.fill();
       
       Ellipse rueda1 = new Ellipse(510,480,50,50);
       rueda1.setColor(Color.BLUE);
       rueda1.draw();
       rueda1.fill();
       
       Ellipse rueda2 = new Ellipse(645,480,50,50);
       rueda2.setColor(Color.BLUE);
       rueda2.draw();
       rueda2.fill();
       
          for (int i=0; i<150; i++){
           Thread.sleep(100 / 30);
    	   carroceria.translate(-3f, 0f);
    	   carroceria1.translate(-3f, 0f);
    	   rueda1.translate(-3f, 0f);
    	   rueda2.translate(-3f, 0f);
    	   luz.translate(-3f, 0f);
    	   luz1.translate(-3f, 0f);
    	   ventana1.translate(-3f, 0f);
    	   ventana.translate(-3f, 0f);    	   
    	   }
	}
}



	
       
       
    
