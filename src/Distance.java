import javax.swing.*;

public class Distance {
// Written by: Mike Baldwin
// Prompts the user to enter the two points, and then displays the distance between them.

public static void main(String[] args) {
    JPanel panel = new JPanel();
    JTextField x1Var = new JTextField(5);
    JTextField y1Var = new JTextField(5);
    JTextField x2Var = new JTextField(5);
    JTextField y2Var = new JTextField(5);
    double x1, x2, y1, y2, distance;
    int confirmCode;

    panel.add(new JLabel("x1: "));
    panel.add(x1Var);
    //panel.add(Box.createHorizontalStrut(15));
    panel.add(new JLabel("y1: "));
    panel.add(y1Var);
    //panel.add(Box.createVerticalStrut(15));
    panel.add(new JLabel("x2: "));
    panel.add(x2Var);
    //panel.add(Box.createHorizontalStrut(15));
    panel.add(new JLabel("y2: "));
    panel.add(y2Var);

    confirmCode = JOptionPane.showConfirmDialog(null, panel,
            "Distance Calculator", JOptionPane.OK_CANCEL_OPTION);
    if (confirmCode == JOptionPane.OK_OPTION) {
        x1 = Double.parseDouble(x1Var.getText());
        y1 = Double.parseDouble(y1Var.getText());
        x2 = Double.parseDouble(x2Var.getText());
        y2 = Double.parseDouble(y2Var.getText());
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        JOptionPane.showMessageDialog(
                null,
                "The Distance is: " + distance);
    }
}
}
