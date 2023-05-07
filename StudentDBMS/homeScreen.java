package com.pkg.StudentDBMS;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;




public class homeScreen {

    public homeScreen() {

    JFrame homepage = new JFrame("Student Portal Home Page");


    JButton stuLoginButton = new JButton("STUDENT LOGIN");
    stuLoginButton.setFont(new Font("Arial", Font.BOLD, 28));
    stuLoginButton.setBounds(317,150,325,88);
    homepage.add(stuLoginButton);

    JButton stuRegButton = new JButton("STUDENT REGISTRATION");
    stuRegButton.setBounds(270,280,420,88);
    stuRegButton.setFont(new Font("Arial", Font.BOLD, 28));
    homepage.add(stuRegButton);

    JButton adminloginbutton = new JButton("Admin Login");
    adminloginbutton.setFont(new Font("Arial", Font.BOLD, 24));
    adminloginbutton.setBounds(720,30,200,60);
    adminloginbutton.setBackground(new Color(145,246,255));
    adminloginbutton.setBorderPainted(false);
    homepage.add(adminloginbutton);


        adminloginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
                new adminLogin();   // Student Reg Form
                homepage.dispose();

            }
        });

    stuLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
                new studentSearch();   // Student Login
                homepage.dispose();

            }
        });

    stuRegButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("clicked");
             new adminHome();   // Student Reg Form

        }
    });





    homepage.getContentPane().setBackground(new Color(145, 246, 255));
    homepage.setSize(960,540);
    homepage.setLayout(null);
    homepage.setVisible(true);
    homepage.setLocationRelativeTo(null);

    }


    public static void main(String[] args) {



        new homeScreen();



    }
}