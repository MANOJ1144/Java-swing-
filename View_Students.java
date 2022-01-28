import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class View_Students {

    private JFrame frame;
    private JTable table;
    private JTable table_1;


    public static void NewScreen14() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    View_Students window = new View_Students();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public View_Students() {
        initialize();
        ShowTable();
        ShowTable1();
    }

    private void ShowTable() {

        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/coursemanagement";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            String query = "SELECT * FROM `student_reg`";
            PreparedStatement insert = conn.prepareStatement(query);
            ResultSet rs = insert.executeQuery();
            while (rs.next()) {

                getModel().addRow(new Object[] { rs.getString("Student_ID"), rs.getString("Level"),rs.getString("Course_Name")

                });
            }

            conn.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public DefaultTableModel getModel() {
        return (DefaultTableModel) getTable().getModel();
    }

    public JTable getTable() {
        return table;
    }

    private void ShowTable1() {

        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/coursemanagement";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            String query = "SELECT * FROM `level_sixreg`";
            PreparedStatement insert = conn.prepareStatement(query);
            ResultSet rs = insert.executeQuery();
            while (rs.next()) {

                getModel1().addRow(new Object[] { rs.getString("Student_ID"),rs.getString("Level"), rs.getString("Module_Name") });
            }
            conn.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public DefaultTableModel getModel1() {
        return (DefaultTableModel) getTable1().getModel();
    }

    public JTable getTable1() {
        return table_1;
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.inactiveCaption);
        panel.setBounds(26, 95, 327, 219);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Level 4 and 5 student");
        lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 13));
        lblNewLabel_1.setBounds(10, 10, 145, 17);
        panel.add(lblNewLabel_1);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 40, 287, 157);
        panel.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Student_ID", "Level", "Course_Name"
                }
        ) {
            Class[] columnTypes = new Class[] {
                    Integer.class, Integer.class, String.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
            boolean[] columnEditables = new boolean[] {
                    false, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(SystemColor.inactiveCaption);
        panel_1.setBounds(389, 95, 332, 219);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("Level 6 student");
        lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 13));
        lblNewLabel_2.setBounds(10, 10, 123, 17);
        panel_1.add(lblNewLabel_2);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(20, 37, 294, 159);
        panel_1.add(scrollPane_1);

        table_1 = new JTable();
        scrollPane_1.setViewportView(table_1);
        table_1.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Student_ID", "Level", "Module_Name"
                }
        ) {
            Class[] columnTypes = new Class[] {
                    Integer.class, Integer.class, Integer.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
            boolean[] columnEditables = new boolean[] {
                    false, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });

        JLabel lblNewLabel = new JLabel("Registered Student List of Level 4, 5 and 6");
        lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 19));
        lblNewLabel.setBounds(26, 28, 410, 39);
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("Back");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Instructor_Functions.NewScreen12();
                frame.dispose();
            }
        });
        
    }

}
