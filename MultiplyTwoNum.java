package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MultiplyTwoNum extends JFrame implements ActionListener {
    JTextField ent1;
    JTextField ent2;
    JButton mul;
    JTextField res;

    public MultiplyTwoNum() {
        setBounds(400, 400, 400, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ent1 = new JTextField();
        ent1.setBounds(30, 30, 100, 20);
        add(ent1);
        ent2 = new JTextField();
        ent2.setBounds(30, 90, 100, 20);
        add(ent2);
        mul = new JButton("*");
        mul.setBounds(30, 60, 60, 20);
        add(mul);
        mul.addActionListener(this);
        res = new JTextField("");
        res.disable();
        res.setBounds(30, 120, 100, 20);
        add(res);
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(ent1.getText());
        int b = Integer.parseInt(ent2.getText());
        int c = 0;
        if (e.getSource().equals(mul))
            c = a * b;
        res.setText(String.valueOf(c));
    }
    public static void main(String[] args){

        MultiplyTwoNum MultiplyTwoNum = new MultiplyTwoNum();
    }
}