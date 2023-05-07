package com.pkg.StudentDBMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class studentLogin {

   public studentLogin(){
        JFrame studentLoginPage = new JFrame("Student Login");

       JLabel studentLoginlabel = new JLabel("Student Login");
       studentLoginlabel.setFont(new Font("Arial", Font.BOLD, 24));
       studentLoginlabel.setBounds(111,50,160,40);
       studentLoginPage.add(studentLoginlabel);

       JLabel stuEnrollment = new JLabel("Enrollement No.");
       stuEnrollment.setFont(new Font("Arial", Font.PLAIN, 14));
       stuEnrollment.setBounds(70,120,150,40);
       studentLoginPage.add(stuEnrollment);

       JTextField stuEnrollmentTf = new JTextField();
       stuEnrollmentTf.setFont(new Font("Arial", Font.PLAIN, 14));
       stuEnrollmentTf.setBounds(70,160,280,30);
       studentLoginPage.add(stuEnrollmentTf);


       JLabel stupasswordlbl = new JLabel("Password");
       stupasswordlbl.setFont(new Font("Arial", Font.PLAIN, 14));
       stupasswordlbl.setBounds(70,200,150,40);
       studentLoginPage.add(stupasswordlbl);

       JPasswordField stuPassTf = new JPasswordField();
       stuPassTf.setFont(new Font("Arial", Font.PLAIN, 20));
       stuPassTf.setBounds(70,240,280,30);
       studentLoginPage.add(stuPassTf);

       JButton stuLoginbutton = new JButton("Log In");
       stuLoginbutton.setBounds(132,300,156,45);
       stuLoginbutton.setFont(new Font("Arial", Font.BOLD, 20));
       studentLoginPage.add(stuLoginbutton);




        studentLoginPage.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new homeScreen();
            }
        });
        studentLoginPage.setLayout(null);
        studentLoginPage.setVisible(true);
        studentLoginPage.setSize(421,460);
        studentLoginPage.setLocationRelativeTo(null);
        studentLoginPage.getContentPane().setBackground(new Color(145, 246, 255));

    }

    public static void main(String[] args) {
        new studentLogin();
    }

}
