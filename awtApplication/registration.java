package com.pkg.awtApplication;

import java.awt.EventQueue;
import java.awt.*;
import java.sql.*;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class registration {

    protected static final JLabel mobile_validation = null;
    private JFrame frmRegistrationForm;
    private JTextField textName;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();
    private JTextField textSurname;
    private JTextField textAge;
    private JTextField textEmail;
    private JTextField textUserName;
    private JTextField textPassword;
    private JTextField textMobile;
    protected String Gender;
    protected int len;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    registration window = new registration();
                    window.frmRegistrationForm.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public registration() {
        initialize();
    }
    public void validateFields (JTextField fields, JLabel label, String name)
    {
        if (fields.getText().length()>10)
        {
            label.setText("Invalid"+name);
        }
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmRegistrationForm = new JFrame();
        frmRegistrationForm.getContentPane().setBackground(Color.PINK);
        frmRegistrationForm.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
        frmRegistrationForm.setAlwaysOnTop(true);
        frmRegistrationForm.setBackground(Color.DARK_GRAY);
        frmRegistrationForm.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\john\\Downloads\\user.png"));
        frmRegistrationForm.setTitle("Registration Form");
        frmRegistrationForm.setBounds(100, 100, 649, 784);
        frmRegistrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmRegistrationForm.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Name :");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel.setBounds(64, 92, 153, 31);
        frmRegistrationForm.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Surname :");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_1.setBounds(64, 155, 116, 31);
        frmRegistrationForm.getContentPane().add(lblNewLabel_1);

        JLabel IbNewLabel_2 = new JLabel("Gender :");
        IbNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
        IbNewLabel_2.setBounds(64, 220, 98, 31);
        frmRegistrationForm.getContentPane().add(IbNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Age :");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_2_1.setBounds(64, 293, 98, 31);
        frmRegistrationForm.getContentPane().add(lblNewLabel_2_1);

        JLabel lblNewLabel_2_2 = new JLabel("Email :");
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_2_2.setBounds(64, 407, 98, 39);
        frmRegistrationForm.getContentPane().add(lblNewLabel_2_2);

        JLabel lblNewLabel_2_3 = new JLabel("User Name :");
        lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_2_3.setBounds(64, 478, 116, 31);
        frmRegistrationForm.getContentPane().add(lblNewLabel_2_3);

        JLabel lblNewLabel_2_4 = new JLabel("Password :");
        lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_2_4.setBounds(64, 551, 98, 31);
        frmRegistrationForm.getContentPane().add(lblNewLabel_2_4);

        textName = new JTextField();
        textName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
            }
        });
        textName.setBounds(212, 95, 347, 31);
        frmRegistrationForm.getContentPane().add(textName);
        textName.setColumns(10);

        final JRadioButton rbMale = new JRadioButton("Male");
        rbMale.setBackground(Color.PINK);
        rbMale.setFont(new Font("Tahoma", Font.BOLD, 17));
        buttonGroup.add(rbMale);
        rbMale.setBounds(268, 228, 103, 21);
        frmRegistrationForm.getContentPane().add(rbMale);

        final JRadioButton rbFemale = new JRadioButton("Female");
        rbFemale.setBackground(Color.PINK);
        rbFemale.setFont(new Font("Tahoma", Font.BOLD, 17));
        buttonGroup_1.add(rbFemale);
        rbFemale.setBounds(419, 228, 103, 21);
        frmRegistrationForm.getContentPane().add(rbFemale);

        textSurname = new JTextField();
        textSurname.setColumns(10);
        textSurname.setBounds(212, 158, 347, 31);
        frmRegistrationForm.getContentPane().add(textSurname);

        textAge = new JTextField();
        textAge.setColumns(10);
        textAge.setBounds(212, 293, 347, 31);
        frmRegistrationForm.getContentPane().add(textAge);

        textEmail = new JTextField();
        textEmail.setColumns(10);
        textEmail.setBounds(212, 414, 347, 31);
        frmRegistrationForm.getContentPane().add(textEmail);

        textUserName = new JTextField();
        textUserName.setColumns(10);
        textUserName.setBounds(212, 481, 347, 31);
        frmRegistrationForm.getContentPane().add(textUserName);

        textPassword = new JTextField();
        textPassword.setColumns(10);
        textPassword.setBounds(212, 554, 347, 31);
        frmRegistrationForm.getContentPane().add(textPassword);

        JButton btnReset = new JButton("RESET");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textName.setText("");
                textSurname.setText("");
                textAge.setText("");
                textMobile.setText("");
                textEmail.setText("");
                textUserName.setText("");
                textPassword.setText("");
                buttonGroup.clearSelection();
            }
        });
        btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnReset.setBounds(125, 645, 145, 44);
        frmRegistrationForm.getContentPane().add(btnReset);

        final JButton btnsubmit = new JButton("SUBMIT");
        btnsubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        btnsubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/users";
                String user = "root";
                String password ="Avanti@123";
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url,user,password);

                    String query="insert into registration values(?,?,?,?,?,?,?,?)";
                    PreparedStatement ps = connection.prepareStatement(query);
                    if (!(Pattern.matches("^[a-zA-Z]+$", textName.getText()))) {
                        JOptionPane.showMessageDialog(null, "Please enter valid name", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        ps.setString(1, textName.getText());
                    }
                    if (!(Pattern.matches("^[a-zA-Z]+$", textSurname.getText()))) {
                        JOptionPane.showMessageDialog(null, "Please enter valid surname", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        ps.setString(2, textSurname.getText());
                    }
                    ps.setString(3, Gender);
                    if(rbFemale.isSelected()) {
                        Gender="Female";
                    }
                    if (!(Pattern.matches("^[a-zA-Z]+$", textAge.getText()))) {
                        JOptionPane.showMessageDialog(null, "Please enter valid age", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        ps.setInt(4, Integer.parseInt(textAge.getText()));
                    }
                    if((textMobile.getText().length()) !=10) {
                        JOptionPane.showMessageDialog(null, "Please enter valid mobie number", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        ps.setInt(5, Integer.parseInt(textMobile.getText()));
                    }
                    if (!(Pattern.matches("[a-zA-Z0-9._-]"+"@"+"[a-z]"+ "\\." +"[a-z]", textEmail.getText()))) {
                        JOptionPane.showMessageDialog(null, "Please enter valid email", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        ps.setString(6, textEmail.getText());
                    }
                    ps.setString(7, textUserName.getText());

                    ps.setString(8, textPassword.getText());




                    int i=ps.executeUpdate();

                    JOptionPane.showMessageDialog(btnsubmit, i+"Record Added Successfully!");
                    ps.close();
                    connection.close();



                }catch(Exception e1){
                    JOptionPane.showMessageDialog(null, e1);

                } finally {
                }
            }
        });
        btnsubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnsubmit.setBounds(350, 646, 145, 42);
        frmRegistrationForm.getContentPane().add(btnsubmit);

        JTextArea txtrUserRegistration = new JTextArea();
        txtrUserRegistration.setBackground(Color.PINK);
        txtrUserRegistration.setFont(new Font("Tahoma", Font.BOLD, 20));
        txtrUserRegistration.setText("USER REGISTRATION");
        txtrUserRegistration.setBounds(192, 24, 238, 31);
        frmRegistrationForm.getContentPane().add(txtrUserRegistration);

        JLabel lblNewLabel_2_2_1 = new JLabel("Mobile");
        lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_2_2_1.setBounds(64, 348, 98, 39);
        frmRegistrationForm.getContentPane().add(lblNewLabel_2_2_1);

        textMobile = new JTextField();
        textMobile.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
            }
            @Override
            public void focusLost(FocusEvent e) {

            }

        });
        textMobile.setColumns(10);
        textMobile.setBounds(212, 356, 347, 31);
        frmRegistrationForm.getContentPane().add(textMobile);

        JLabel mobile_validation = new JLabel("");
        mobile_validation.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
            }
        });
        mobile_validation.setBounds(212, 391, 218, 13);
        frmRegistrationForm.getContentPane().add(mobile_validation);
    }
}
