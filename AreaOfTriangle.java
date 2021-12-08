package JavaSwing;

import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
public class AreaOfTriangle extends JFrame implements ActionListener {
    JLabel base,height,result;
    JTextField ent1,ent2;
    JButton tri;
    public AreaOfTriangle(){
        setBounds(400,400,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("AREA OF TRIANGLE ");
        setResizable(false);
        base = new JLabel("Base:");
        base.setBounds(30,30,100,20);
        add(base);
        ent1 = new JTextField();
        ent1.setBounds(80,30,100,20);
        add(ent1);
        height = new JLabel("Height:");
        height.setBounds(30,60,100,20);
        add(height);
        ent2 = new JTextField();
        ent2.setBounds(80,60,100,20);
        add(ent2);
        tri = new JButton("area of triangle");
        tri.setBounds(30,90,120,20);
        tri.addActionListener(this);
        add(tri);
        result = new JLabel("Result");
        result.setBounds(30,120,100,20);
        add(result);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        float b = Float.parseFloat(ent1.getText());
        float h = Float.parseFloat(ent2.getText());
        float r = 0;
        if (e.getSource().equals(tri))
            r = (b*h)/2;
        result.setText(String.valueOf(r));
    }
    public static void main(String[] args) {
        AreaOfTriangle area = new AreaOfTriangle();
    }
}