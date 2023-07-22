import java.awt.*;
import java.awt.event.*;
public class Question3 extends Frame {
    private TextField[] txtMarks;
    private Label lblResult;
    public p3() {
        setTitle("Marks Calculator");
        setSize(300, 200);
        setLayout(new FlowLayout());
        txtMarks = new TextField[5];
        for (int i = 0; i < 5; i++) {
            Label lblSubject = new Label("Subject " + (i + 1) + ":");
            txtMarks[i] = new TextField(10);
            add(lblSubject);
            add(txtMarks[i]);
        }
        Button btnCalculate = new Button("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int totalMarks = 0;
                for (int i = 0; i < 5; i++) {
                    int marks = Integer.parseInt(txtMarks[i].getText());
                    totalMarks += marks;
                }
                double percentage = (totalMarks / 500.0) * 100;
                if (percentage > 50) {
                    lblResult.setText("\uD83D\uDE00");
                } else {
                    lblResult.setText("\uD83D\uDE41"); 
                }
            }
        });
        lblResult = new Label();
        add(btnCalculate);
        add(lblResult);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Program3();
    }
}
