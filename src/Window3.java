import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window3 implements ActionListener {
    int counter = 0;
    String labelText = "Liczba klikniec: ";
    JFrame box = new JFrame();
    JLabel label = new JLabel(labelText + counter);
    JButton buttonCpp = new JButton("C++");
    JButton buttonReset = new JButton("Reset");
    JButton buttonClose = new JButton("Close");

    Window3(){

        buttonCpp.setBounds(10, 20, 200, 50);
        buttonCpp.addActionListener(this);
        buttonReset.addActionListener(this);
        buttonClose.addActionListener(this);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.add(buttonCpp);
        panel.add(label);
        box.add(panel, BorderLayout.LINE_END);
        box.add(buttonReset, BorderLayout.CENTER);
        box.add(buttonClose, BorderLayout.SOUTH);
        box.setTitle("Counter-Button");
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box.setSize(500, 200);
        box.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == buttonCpp){
            counter ++;
        }
        if(src == buttonReset){
            counter = 0;
        }
        if(src == buttonClose){
            box.setVisible(false);
        }
        label.setText(labelText + counter);
    }

    public static void main(String[] args) {
        new Window3();
    }
}
