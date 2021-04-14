//ceng497 labwork5
//Ecem Emiroðlu
//201611018

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;




public class Gradient extends Frame {
	//Constructor
	 public Gradient()
	 {
		 addWindowListener(new MyFinishWindow());
		 setTitle("Gradient");
	 }
	 public void paint(Graphics g)
	 {
		 Graphics2D g2d = (Graphics2D) g;
		 
		 GradientPaint gp2= new GradientPaint(50,50,Color.blue,200,200,Color.green, false);
		 g2d.setPaint(gp2);
		 g2d.fill(new Rectangle2D.Double(50,50,200,200));
		 
		
		 
		 GradientPaint gp1 = new GradientPaint(4, 18, Color.black, 4, 2, Color.white, true);
		    g2d.setPaint(gp1);
		    g2d.fillRect(300, 50, 200, 200);
		 
		 
	 // A square to be filled by color interpolation without repetition.
	 // Choose two colors you like for the gradient paint.
	 // The first gradient should be parallel to the diagonal of the
	 // square to be filled. The color gradient is not repeated so that the
	 // the upper left part of the square is one color and the lower right part is
	 // the other.
	 // A second square to be filled by repeated color interpolation.
	 // The color gradient is defined in the same way as for the first square.
	 // Choose two different colors that you like.
	 // However, this time the color gradient is applied repeatedly.
	 
	 }
	 public class MyFinishWindow extends WindowAdapter
	   {
	     public void windowClosing(WindowEvent e)
	     {
	       System.exit(0);
	     }
	   }
	 public static void main(String[] args)
	 {
		 Gradient gradient=new Gradient();
		 gradient.setSize(600,600);
		 gradient.setVisible(true);
	 } 
}
