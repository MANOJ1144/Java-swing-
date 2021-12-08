package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginHidepassword extends JFrame implements ActionListener {
    JLabel labelHello;
    JLabel labelhello2;
    JTextField UserName;
    JLabel Password1;
    JPasswordField password;
    JCheckBox login;

    private LoginHidepassword() {
        setTitle("Sign-In-Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(800, 600, 600, 500);
        setResizable(true);
        setLayout(null);

        labelHello = new JLabel("Sign in");
        labelHello.setForeground(Color.BLACK);
        labelHello.setBounds(200,10,160,100);
        labelHello.setFont(new Font("Arial", Font.BOLD, 30));
        add(labelHello);

        labelhello2 = new JLabel("Enter-Username :");
        labelhello2.setForeground(Color.BLACK);
        labelhello2.setBounds(80,100,180,20);
        labelhello2.setFont(new Font("Arial", Font.BOLD, 20));
        add(labelhello2);



        UserName = new JTextField();
        UserName.setBounds(260,100,160,20);
        UserName.setForeground(Color.BLACK);

        add(UserName);

//        adding a new label password and adding it to the GUI frame

        Password1 = new JLabel("Enter-Password :");
        Password1.setBounds(80,180,190,30);
        Password1.setBackground(Color.BLACK);
        Password1.setFont(new Font("Arial", Font.BOLD, 20));
        add(Password1);

//        adding an entry-label for password
        password = new JPasswordField();
        password.setBounds(260,185,160,20);
        password.setForeground(Color.BLACK);
        add(password);

        login = new JCheckBox("Show Password");
        login.setBounds(200,230,160,30);
        add(login);

        login.addActionListener(this);



    }

    public static void main(String[] args) {
        new LoginHidepassword().setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(login))
        {
            if(login.isSelected()){
                password.setEchoChar((char) 0);

            }
            else{
                password.setEchoChar('-');
            }
        }

    }
}