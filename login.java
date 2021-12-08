package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
class login extends JFrame
{
    JLabel user;
    JLabel password;
    JTextField user_1;
    JPasswordField password_1;
    JButton Sig;
    JButton up;
    JCheckBoxMenuItem hide;
    public login()
    {
        setTitle("Welcome!!!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 50, 500, 400);
        setResizable(false);
        setLayout(null);
        user = new JLabel("ENTER USERNAME :");
        user.setForeground(Color.black);
        user.setBounds(20, 50, 150, 30);
        add(user);

        user_1 = new JTextField();
        user_1.setForeground(Color.black);
        user_1.setBounds(150, 55, 150, 25);
        add(user_1);

        password = new JLabel("ENTER PASSWORD :");
        password.setForeground(Color.black);
        password.setBounds(20, 80, 150, 30);
        add(password);

        password_1 = new JPasswordField();
        password_1.setForeground(Color.black);
        password_1.setBounds(150, 85, 150, 25);
        add(password_1);

        Sig = new JButton("Login In");
        Sig.setForeground(Color.black);
        Sig.setBounds(120, 140, 100, 30);
        add(Sig);
        up = new JButton("Sign up");
        up.setForeground(Color.black);
        up.setBounds(120, 190, 100, 30);
        add(up);
        hide = new JCheckBoxMenuItem("Seen or Unseen");
        hide.setForeground(Color.black);
        hide.setBounds(120, 220, 120, 30);
        add(hide);
    }

    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource().equals(hide))
        {
            password_1.setText(password_1.getText());
        }
    }

    public static void main(String[] args)
    {
        new login().setVisible(true);
    }

}

