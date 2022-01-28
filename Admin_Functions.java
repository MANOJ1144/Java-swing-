import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_Functions {

    private JFrame frame;
    private JTextField textField;
    protected JPasswordField passwordField;



    public static void NewScreen1() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Admin_Functions window = new Admin_Functions();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public Admin_Functions() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.getContentPane().setLayout(null);

        JLabel Admin = new JLabel("Admin LogIn");
        Admin.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        Admin.setBounds(39, 43, 170, 29);
        frame.getContentPane().add(Admin);

        JLabel Name = new JLabel("Admin_Name");
        Name.setFont(new Font("Bahnschrift", Font.BOLD, 16));
        Name.setBounds(36, 103, 112, 29);
        frame.getContentPane().add(Name);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Bahnschrift", Font.BOLD, 16));
        password.setBounds(36, 152, 85, 29);
        frame.getContentPane().add(password);

        JButton btnNewButton_1 = new JButton("LogIn");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String UN = textField.getText();
                String pwd = passwordField.getText();

                if(UN.equals("admin") && pwd.equals("admin"))
                {
                    JOptionPane.showMessageDialog(frame, "Logged In Sucessfully!!");
                    Admin_LogIn nw = new Admin_LogIn();//action use to open another form
                    nw.NewScreen3();


                }
                else {
                    JOptionPane.showMessageDialog(frame, "Invalid User name and password!!");
                }
            }

        });

        btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
        btnNewButton_1.setBounds(397, 261, 85, 29);
        frame.getContentPane().add(btnNewButton_1);

        
    }

}
