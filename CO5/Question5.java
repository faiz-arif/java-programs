package co5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class p5 extends Frame implements ActionListener {
    private TextField inputField;
    public Question5() {
        setTitle("Simple Calculator");
        setLayout(new BorderLayout());
        setSize(250, 300);
        setResizable(false);
        inputField = new TextField();
        inputField.setEditable(false);
        add(inputField, BorderLayout.NORTH);
        Panel buttonPanel = new Panel(new GridLayout(4, 4));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("=")) {
            String expression = inputField.getText();
            try {
                double result = evaluateExpression(expression);
                inputField.setText(Double.toString(result));
            } catch (IllegalArgumentException ex) {
                inputField.setText("Error");
            }
        } else {
            inputField.setText(inputField.getText() + command);
        }
    }
    private double evaluateExpression(String expression) {
        return Calculator.evaluate(expression);
    }
    public static void main(String[] args) {
        new p5();
    }
}
