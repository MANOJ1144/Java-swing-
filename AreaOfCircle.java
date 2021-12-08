package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AreaOfCircle extends JFrame implements ActionListener {

    JTextField ent1;
    JLabel radius,result;
    JButton circle;
    public AreaOfCircle(){
        setBounds(400,400,400,400);
        setTitle("AREA OF CIRCLE");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        radius = new JLabel("Radius : ");
        radius.setBounds(30,30,100,20);
        add(radius);
        ent1 = new JTextField();
        ent1.setBounds(80,30,100,20);
        add(ent1);
        circle = new JButton("Area of circle");
        circle.setBounds(30,60,130,20);
        circle.addActionListener(this);
        add(circle);
        result = new JLabel("result");
        result.setBounds(30,90,100,20);
        add(result);
        setLayout(null);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        float radius = Float.parseFloat(ent1.getText());
        float ans = 0;
        if (e.getSource().equals(circle))
            ans = (float) (3.14*radius*radius);
        result.setText(String.valueOf(ans));
    }

    public static void main(String[] args) {

        AreaOfCircle AreaOfCircle = new AreaOfCircle();
    }
}