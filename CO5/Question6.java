package co5;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class p6 extends Frame implements ItemListener {
    private Choice shapeChoice;
    public Question6() {
        setTitle("Shape Drawing Program");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setResizable(false);
        shapeChoice = new Choice();
        shapeChoice.add("Rectangle");
        shapeChoice.add("Triangle");
        shapeChoice.add("Square");
        shapeChoice.add("Circle");
        shapeChoice.addItemListener(this);
        add(shapeChoice);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == shapeChoice) {
            String selectedShape = shapeChoice.getSelectedItem();
            if (selectedShape.equals("Rectangle")) {
                drawRectangle();
            } else if (selectedShape.equals("Triangle")) {
                drawTriangle();
            } else if (selectedShape.equals("Square")) {
                drawSquare();
            } else if (selectedShape.equals("Circle")) {
                drawCircle();
            }
        }
    }
    private void drawRectangle() {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 200, 150);
    }
    private void drawTriangle() {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        int[] xPoints = {200, 100, 300};
        int[] yPoints = {100, 250, 250};
        g.fillPolygon(xPoints, yPoints, 3);
    }
    private void drawSquare() {
        Graphics g = getGraphics();
        g.setColor(Color.GREEN);
        g.fillRect(100, 100, 150, 150);
    }
    private void drawCircle() {
        Graphics g = getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(150, 150, 200, 200);
    }
    public static void main(String[] args) {
        new p6();
    }
}
