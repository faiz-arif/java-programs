package co5;
import java.awt.*;
import java.awt.event.*;
public class Question2 extends Frame {
    private TextField txtNum1, txtNum2, txtNum3;
    private Label lblResult;
    public p2() {
        setTitle("Maximum Number Finder");
        setSize(300, 200);
        setLayout(new FlowLayout());
        Label lblNum1 = new Label("Number 1:");
        txtNum1 = new TextField(10);
        Label lblNum2 = new Label("Number 2:");
        txtNum2 = new TextField(10);
        Label lblNum3 = new Label("Number 3:");
        txtNum3 = new TextField(10);
        Button btnFindMax = new Button("Find Maximum");
        btnFindMax.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txtNum1.getText());
                int num2 = Integer.parseInt(txtNum2.getText());
                int num3 = Integer.parseInt(txtNum3.getText());
                int max = Math.max(Math.max(num1, num2), num3);
                lblResult.setText("Maximum Number: " + max);
            }
        });

        lblResult = new Label();
        add(lblNum1);
        add(txtNum1);
        add(lblNum2);
        add(txtNum2);
        add(lblNum3);
        add(txtNum3);
        add(btnFindMax);
        add(lblResult);
  setVisible(true);
    }
    public static void main(String[] args) {
        new p2();
    }
}
