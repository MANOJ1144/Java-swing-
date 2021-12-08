package JavaSwing;
import javax.swing.*;
public class HelloWorld {
    public static void main(String[] args) {
//declaration of the elements
        JFrame frame;
        JLabel label;

        frame = new JFrame();
        label = new JLabel("Hello World");

        label.setBounds(130, 100, 100, 40);
        frame.add(label);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
