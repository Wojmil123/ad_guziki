import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Window1 implements ActionListener {
    int counter = 0;
    String labelText = "Liczba klikniec: ";
    JFrame box = new JFrame();
    JLabel label = new JLabel(labelText + counter);

    Window1(){
        JButton buttonCpp = new JButton("C++");
        buttonCpp.setBounds(10, 20, 200, 50);
        buttonCpp.addActionListener(this);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.add(buttonCpp);
        panel.add(label);
        box.add(panel, BorderLayout.LINE_END);
        box.setTitle("Counter-Button");
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box.setSize(500, 200);
        box.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter ++;
        label.setText(labelText + counter);
    }

    public static void main(String[] args) {
        new Window1();
    }
}
