package JavaSwing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DivideTwoNum extends JFrame implements ActionListener {

    JTextField ent1;
    JTextField ent2;
    JButton div;
    JLabel result;
    public DivideTwoNum(){
        setBounds(400,400,400,400);
        setTitle("Division");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ent1 = new JTextField();
        ent1.setBounds(30,30,100,20);
        add(ent1);
        ent2 = new JTextField();
        ent2.setBounds(30,60,100,20);
        add(ent2);
        div = new JButton("/");
        div.addActionListener(this);
        div.setBounds(30,90,60,20);
        add(div);
        result = new JLabel("Result:");
        result.setBounds(30,120,100,20);
        add(result);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(ent1.getText());
        int b = Integer.parseInt(ent2.getText());
        int c = 0;
        if(e.getSource().equals(div))
            c=a/b;
        result.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        DivideTwoNum DivideTwoNum = new DivideTwoNum();
    }
}