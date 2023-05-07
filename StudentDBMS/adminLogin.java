package com.pkg.StudentDBMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class adminLogin {

    public adminLogin(){
        JFrame adminLoginPage = new JFrame("Admin Login");

        JLabel adminLoginlabel = new JLabel("Admin Login");
        adminLoginlabel.setFont(new Font("Arial", Font.BOLD, 24));
        adminLoginlabel.setBounds(125,50,160,40);
        adminLoginPage.add(adminLoginlabel);

        JLabel administratorLbl = new JLabel("Administrator");
        administratorLbl.setFont(new Font("Arial", Font.PLAIN, 14));
        administratorLbl.setBounds(70,120,150,40);
        adminLoginPage.add(administratorLbl);

        JTextField admintf = new JTextField();
        admintf.setFont(new Font("Arial", Font.PLAIN, 14));
        admintf.setBounds(70,160,280,30);
        adminLoginPage.add(admintf);


        JLabel adminpasswordlbl = new JLabel("Password");
        adminpasswordlbl.setFont(new Font("Arial", Font.PLAIN, 14));
        adminpasswordlbl.setBounds(70,200,150,40);
        adminLoginPage.add(adminpasswordlbl);

        JPasswordField adminPassTf = new JPasswordField();
        adminPassTf.setFont(new Font("Arial", Font.PLAIN, 20));
        adminPassTf.setBounds(70,240,280,30);
        adminLoginPage.add(adminPassTf);

        JButton adminLoginbutton = new JButton("Log In");
        adminLoginbutton.setBounds(132,300,156,45);
        adminLoginbutton.setFont(new Font("Arial", Font.BOLD, 20));
        adminLoginPage.add(adminLoginbutton);



        adminLoginPage.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new homeScreen();
            }
        });
        adminLoginPage.setLayout(null);
        adminLoginPage.setVisible(true);
        adminLoginPage.setSize(421,460);
        adminLoginPage.setLocationRelativeTo(null);
        adminLoginPage.getContentPane().setBackground(new Color(145, 246, 255));

    }

    public static void main(String[] args) {
        new adminLogin();
    }

}
