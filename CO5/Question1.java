package co5;
/* Program to draw Circle, Rectangle, Line in Applet. */
import java.awt.*;
import java.applet.Applet;
public class Question1 extends Applet {
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawOval(100,150,200,200);
		g.drawRect(100,150,200,200);
		g.drawLine(100,150,300,350);
}
}
