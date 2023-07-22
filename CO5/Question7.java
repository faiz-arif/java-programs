package co5;
import java.awt.*;
import java.awt.event.*;
public class Question7 extends  Frame
        implements MouseListener, MouseMotionListener, WindowListener {
    public p7() {
        setTitle("Event Handling Program");
        setSize(400, 400);
        setLayout(null);
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(this);

        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed: (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released: (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered: (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited: (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged: (" + e.getX() + ", " + e.getY() + ")");
    }
}
