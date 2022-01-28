import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class displaySchedual {

    private JFrame frame;
    private JTable table;
    Connection conn;
    ResultSet rs;
    ResultSetMetaData rsd;
    PreparedStatement preparedStmt;



    public static void NewScreen13() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    View_Instructor window = new View_Instructor();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public displaySchedual() {
        initialize();
        DbConnection();
        ShowTable();
    }

    public void DbConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coursemanagement", "root", "");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    private void ShowTable() {

        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/coursemanagement";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            String query = "SELECT * FROM `ins_assig`" ;
            PreparedStatement insert = conn.prepareStatement(query);
            ResultSet rs = insert.executeQuery();
            while (rs.next()) {

                getModel().addRow(new Object[] { rs.getString("Module_ID"), rs.getString("Level"), rs.getString("Semester"), rs.getString("Instructor_ID")
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


    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(34, 86, 363, 182);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Module_ID", "Level", "Semester", "Instructor_ID"
                }
        ) {
            Class[] columnTypes = new Class[] {
                    Integer.class, Integer.class, Integer.class, Integer.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
            boolean[] columnEditables = new boolean[] {
                    false, false, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        scrollPane.setViewportView(table);

        JLabel lblNewLabel = new JLabel("Instructor Detail");
        lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 18));
        lblNewLabel.setBounds(34, 40, 197, 18);
        frame.getContentPane().add(lblNewLabel);

        JButton BtnBack = new JButton("Back");
        BtnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
        BtnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Instructor_Functions.NewScreen12();
                frame.dispose();
            }
        });
        BtnBack.setBounds(416, 265, 75, 27);
        frame.getContentPane().add(BtnBack);
        frame.setBounds(100, 100, 515, 339);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}