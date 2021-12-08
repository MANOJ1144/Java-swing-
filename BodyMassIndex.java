package JavaSwing;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BodyMassIndex extends JFrame implements ActionListener {
    JTextField ent1;
    JTextField ent2;
    JLabel weight;
    JLabel height;
    JButton bmi;
    JLabel result;
    public BodyMassIndex(){
        setBounds(400,400,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("BMI");
        weight = new JLabel("Weigh in kg:");
        weight.setBounds(30,30,120,20);
        add(weight);
        ent1 = new JTextField();
        ent1.setBounds(125,30,100,20);
        add(ent1);
        height = new JLabel("Height in meter:");
        height.setBounds(30,60,120,20);
        add(height);
        ent2 = new JTextField();
        ent2.setBounds(125,60,100,20);
        add(ent2);
        bmi = new JButton("BMI");
        bmi.setBounds(30,90,60,20);
        bmi.addActionListener(this);
        add(bmi);
        result = new JLabel("result:");
        result.setBounds(30,120,60,20);
        add(result);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float a = Float.parseFloat(ent1.getText());
        float b = Float.parseFloat(ent2.getText());
        float c = 0;
        if (e.getSource().equals(bmi))
            c =(a/(b*b));
        result.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        BodyMassIndex BodyMassIndex = new BodyMassIndex();
    }
}