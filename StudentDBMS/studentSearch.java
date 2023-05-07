package com.pkg.StudentDBMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class studentSearch {

    public studentSearch(){
        JFrame studentSearchPage = new JFrame("Search Student");

        JLabel studentLoginlabel = new JLabel("Search Student");
        studentLoginlabel.setFont(new Font("Arial", Font.BOLD, 24));
        studentLoginlabel.setBounds(111,50,200,40);
        studentSearchPage.add(studentLoginlabel);

        JLabel stuEnrollment = new JLabel("Enrollement No.");
        stuEnrollment.setFont(new Font("Arial", Font.PLAIN, 14));
        stuEnrollment.setBounds(70,120,150,40);
        studentSearchPage.add(stuEnrollment);

        JTextField stuEnrollmentTf = new JTextField();
        stuEnrollmentTf.setFont(new Font("Arial", Font.PLAIN, 14));
        stuEnrollmentTf.setBounds(70,160,280,30);
        studentSearchPage.add(stuEnrollmentTf);




        JButton stuLoginbutton = new JButton("Search");
        stuLoginbutton.setBounds(132,230,156,45);
        stuLoginbutton.setFont(new Font("Arial", Font.BOLD, 20));
        studentSearchPage.add(stuLoginbutton);




        studentSearchPage.setLayout(null);
        studentSearchPage.setVisible(true);
        studentSearchPage.setSize(421,380);
        studentSearchPage.setLocationRelativeTo(null);
        studentSearchPage.getContentPane().setBackground(new Color(145, 246, 255));

    }

    public static void main(String[] args) {
        new studentSearch();
    }

}
