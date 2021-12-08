package JavaSwing;

import javax.swing.*;
import java.awt.*;

    public class LoginPage extends JFrame {
        JLabel labelHello;
        public LoginPage(){
            setTitle("Welcome");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setBounds(400, 150 , 600, 400);
            setResizable(false);

            labelHello= new JLabel("USERNAME");
            labelHello.setForeground(Color.black);
            labelHello.setFont(new Font( "Ariel",Font.BOLD, 20));
            labelHello.setBounds(150, 50, 100, 25);
            add(labelHello);
        }

        public static void main(String[] args){
            new HelloWorld2().setVisible(true);
        }




    }

