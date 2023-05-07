package com.pkg.StudentDBMS;

import javax.swing.*;
import java.awt.*;

public class studentList {

    public studentList(){


        JFrame studentListPage = new JFrame("Student List");

        JLabel studentReglabel = new JLabel("Student Details");
        studentReglabel.setFont(new Font("Arial", Font.BOLD, 24));
        studentReglabel.setBounds(300,20,300,40);
        studentListPage.add(studentReglabel);


        JComboBox<String> deptcombobox = new JComboBox<String>();
        deptcombobox.setFont(new Font("Arial", Font.PLAIN, 15));
        deptcombobox.setBounds(280,70,200,30);
        deptcombobox.setBackground(Color.white);
        deptcombobox.addItem("Computer Science");
        deptcombobox.addItem("Civil");
        deptcombobox.addItem("Electrical");
        deptcombobox.addItem("Electronics & Communication");
        deptcombobox.addItem("Information Technology");
        deptcombobox.addItem("Mechanical Engineering");
        studentListPage.add(deptcombobox);



       JPanel containerBox = new JPanel();
       containerBox.setBackground(Color.white);
       containerBox.setBounds(180,110,400,500);
       studentListPage.add(containerBox);

       JLabel EnrollmentNo = new JLabel("Enrollment No.      _");

        EnrollmentNo.setFont(new Font("Arial", Font.BOLD, 18));
        EnrollmentNo.setBounds(50,55,200,40);
        containerBox.add(EnrollmentNo);

            JLabel studentName = new JLabel("_       Student Name");

            studentName.setFont(new Font("Arial", Font.BOLD, 18));
            studentName.setBounds(-100,55,200,40);
            containerBox.add(studentName);

























        studentListPage.setLayout(null);
        studentListPage.setVisible(true);
        studentListPage.setSize(795,720);
        studentListPage.setLocationRelativeTo(null);
        studentListPage.getContentPane().setBackground(new Color(145, 246, 255));

    }

    public static void main(String[] args) {
        new studentList();
    }
}
