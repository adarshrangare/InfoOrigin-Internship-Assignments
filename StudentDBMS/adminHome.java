package com.pkg.StudentDBMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminHome {

    public adminHome(){


        JFrame adminHomePage = new JFrame("Admin Home");

        JLabel studentReglabel = new JLabel("Admin Home");
        studentReglabel.setFont(new Font("Arial", Font.BOLD, 28));
        studentReglabel.setBounds(300,20,300,40);
        adminHomePage.add(studentReglabel);

        JButton searchStudentbutton = new JButton("<html>SEARCH<br>STUDENT</html>");
        searchStudentbutton.setBounds(150,200,150,150);
        searchStudentbutton.setFont(new Font("Arial", Font.BOLD, 20));
        adminHomePage.add(searchStudentbutton);


        JButton allstudentbtn = new JButton("<html>All<br>STUDENT</html>");
        allstudentbtn.setBounds(430,200,150,150);
        allstudentbtn.setFont(new Font("Arial", Font.BOLD, 20));
        adminHomePage.add(allstudentbtn);



        searchStudentbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new studentDetails();
            }
        });

        allstudentbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new studentList();
            }
        });








        adminHomePage.setLayout(null);
        adminHomePage.setVisible(true);
        adminHomePage.setSize(760,540);
        adminHomePage.setLocationRelativeTo(null);
        adminHomePage.getContentPane().setBackground(new Color(145, 246, 255));

    }

    public static void main(String[] args) {
        new adminHome();
    }
}
