package JavaSwing;

import javax.swing.*;
        import java.awt.event.ActionListener;
        import java.awt.event.ActionEvent;
public class AddTwoNum extends JFrame implements ActionListener{
    JTextField ent1;
    JTextField ent2;
    JButton additioni;
    JLabel sum;
    public AddTwoNum(){
        setTitle("sum");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,500,500,500);
        ent1 = new JTextField();
        ent1.setBounds(30,30,100,20);
        add(ent1);
        ent2 = new JTextField();
        ent2.setBounds(30,60,100,20);
        add(ent2);
        sum = new JLabel("Result : ");
        sum.setBounds(30,120,80,20);
        add(sum);
        additioni = new JButton("+");
        additioni.setBounds(30,90,60,20);
        add(additioni);
        additioni.addActionListener(this);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(ent1.getText());
        int b = Integer.parseInt(ent2.getText());
        int c = 0;
        if(e.getSource().equals(additioni)){
            c = a+b;
            sum.setText(String.valueOf(c));
        }



    }



    public static void main(String[] args){

        AddTwoNum addTwoNum = new AddTwoNum();
    }


}