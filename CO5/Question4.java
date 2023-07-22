package co5;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Question4 extends Applet implements MouseListener {
    private Color doorColor;
    public void init() {
        doorColor = Color.BLUE;
        addMouseListener(this);
    }
    public void paint(Graphics g) {
        setBackground(Color.GREEN);
        g.setColor(Color.RED);
        g.fillRect(100, 200, 200, 200);
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {200, 100, 200};
        g.setColor(Color.YELLOW);
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(doorColor);
        g.fillRect(160, 300, 80, 100);
    }
    public void mouseClicked(MouseEvent e) {
        if (e.getX() >= 160 && e.getX() <= 240 && e.getY() >= 300 && e.getY() <= 400) {
            doorColor = doorColor.equals(Color.BLUE) ? Color.RED : Color.BLUE;
            repaint();
        }
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
