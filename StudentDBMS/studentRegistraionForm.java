package com.pkg.StudentDBMS;

import javax.swing.*;
import java.awt.*;

public class studentRegistraionForm {

    public studentRegistraionForm(){


        JFrame studentRegPage = new JFrame("Student Registration");

        JLabel studentReglabel = new JLabel("Student Registration");
        studentReglabel.setFont(new Font("Arial", Font.BOLD, 24));
        studentReglabel.setBounds(260,20,300,40);
        studentRegPage.add(studentReglabel);


            JLabel personallbl = new JLabel("Personal Details");
            personallbl.setFont(new Font("Arial", Font.BOLD, 18));
            personallbl.setBounds(310,50,300,40);
            studentRegPage.add(personallbl);


            JLabel studentName = new JLabel("Name :");
            studentName.setFont(new Font("Arial", Font.PLAIN, 15));
            studentName.setBounds(150,100,150,20);
            studentName.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(studentName);


            JTextField studentNameTf = new JTextField();
            studentNameTf.setFont(new Font("Arial", Font.PLAIN, 15));
            studentNameTf.setBounds(320,100,250,25);
            studentRegPage.add(studentNameTf);



            JLabel enrollmentNo = new JLabel("Enrollment No. :");
            enrollmentNo.setFont(new Font("Arial", Font.PLAIN, 15));
            enrollmentNo.setBounds(150,135,150,20);
            enrollmentNo.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(enrollmentNo);


            JTextField enrollmentNoTf = new JTextField();
            enrollmentNoTf.setFont(new Font("Arial", Font.PLAIN, 15));
            enrollmentNoTf.setBounds(320,135,250,25);
            studentRegPage.add(enrollmentNoTf);



            JLabel fatherName = new JLabel("Father's Name :");
            fatherName.setFont(new Font("Arial", Font.PLAIN, 15));
            fatherName.setBounds(150,170,150,20);
            fatherName.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(fatherName);


            JTextField fatherNameTf = new JTextField();
            fatherNameTf.setFont(new Font("Arial", Font.PLAIN, 15));
            fatherNameTf.setBounds(320,170,250,25);
            studentRegPage.add(fatherNameTf);

            JLabel motherName = new JLabel("Mother's Name :");
            motherName.setFont(new Font("Arial", Font.PLAIN, 15));
            motherName.setBounds(150,205,150,20);
            motherName.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(motherName);


            JTextField motherNameTf = new JTextField();
            motherNameTf.setFont(new Font("Arial", Font.PLAIN, 15));
            motherNameTf.setBounds(320,205,250,25);
            studentRegPage.add(motherNameTf);


            JLabel genderlbl = new JLabel("Gender :");
            genderlbl.setFont(new Font("Arial", Font.PLAIN, 15));
            genderlbl.setBounds(150, 240, 150, 20);
            genderlbl.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(genderlbl);

            ButtonGroup genders = new ButtonGroup();
            JRadioButton male = new JRadioButton("Male", false);
            male.setBounds(320, 240, 80, 25);
            male.setFont(new Font("Arial", Font.PLAIN, 15));
            male.setBackground(new Color(145, 246, 255));
            genders.add(male);
            studentRegPage.add(male);

            JRadioButton female = new JRadioButton("Female", false);
            female.setBounds(400, 240, 80, 25);
            female.setFont(new Font("Arial", Font.PLAIN, 15));
            female.setBackground(new Color(145, 246, 255));
            genders.add(female);
            studentRegPage.add(female);

            JRadioButton others = new JRadioButton("Others", false);
            others.setBounds(490, 240, 80, 25);
            others.setFont(new Font("Arial", Font.PLAIN, 15));
            others.setBackground(new Color(145, 246, 255));
            genders.add(others);
            studentRegPage.add(others);



            JLabel doblbl = new JLabel("DOB(dd/mm/yyyy) :");
            doblbl.setFont(new Font("Arial", Font.PLAIN, 15));
            doblbl.setBounds(150,270,150,20);
            doblbl.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(doblbl);


            JTextField dobTf = new JTextField();
            dobTf.setFont(new Font("Arial", Font.PLAIN, 15));
            dobTf.setBounds(320,270,250,25);
            studentRegPage.add(dobTf);


            JLabel emailLbl = new JLabel("Email :");
            emailLbl.setFont(new Font("Arial", Font.PLAIN, 15));
            emailLbl.setBounds(150,305,150,20);
            emailLbl.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(emailLbl);


            JTextField emailTf = new JTextField();
            emailTf.setFont(new Font("Arial", Font.PLAIN, 15));
            emailTf.setBounds(320,305,250,25);
            studentRegPage.add(emailTf);


            JLabel contactlbl = new JLabel("Contact No. :");
            contactlbl.setFont(new Font("Arial", Font.PLAIN, 15));
            contactlbl.setBounds(150,340,150,20);
            contactlbl.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(contactlbl);


            JTextField contactTf = new JTextField();
            contactTf.setFont(new Font("Arial", Font.PLAIN, 15));
            contactTf.setBounds(320,340,250,25);
            studentRegPage.add(contactTf);


            JLabel addressLbl = new JLabel("Address :");
            addressLbl.setFont(new Font("Arial", Font.PLAIN, 15));
            addressLbl.setBounds(150,375,150,20);
            addressLbl.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(addressLbl);


            JTextArea addressTa = new JTextArea();
            addressTa.setFont(new Font("Arial", Font.PLAIN, 15));
            addressTa.setBounds(320,375,250,75);
            studentRegPage.add(addressTa);


            JLabel createPassLbl = new JLabel("Create Password :");
            createPassLbl.setFont(new Font("Arial", Font.PLAIN, 15));
            createPassLbl.setBounds(150,460,150,20);
            createPassLbl.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(createPassLbl);


            JPasswordField createPassTf = new JPasswordField();
            createPassTf.setFont(new Font("Arial", Font.PLAIN, 20));
            createPassTf.setBounds(320,460,250,25);
            studentRegPage.add(createPassTf);


            JLabel confirmPasslbl = new JLabel("Create Password :");
            confirmPasslbl.setFont(new Font("Arial", Font.PLAIN, 15));
            confirmPasslbl.setBounds(150,495,150,20);
            confirmPasslbl.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(confirmPasslbl);


            JPasswordField deptBox = new JPasswordField();
            deptBox.setFont(new Font("Arial", Font.PLAIN, 20));
            deptBox.setBounds(320,495,250,25);
            studentRegPage.add(deptBox);



            JLabel deptLbl = new JLabel("Department :");
            deptLbl.setFont(new Font("Arial", Font.PLAIN, 15));
            deptLbl.setBounds(150,530,150,20);
            deptLbl.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(deptLbl);

         JComboBox<String> deptcombobox = new JComboBox<String>();
            deptcombobox.setFont(new Font("Arial", Font.PLAIN, 15));
            deptcombobox.setBounds(320,530,250,25);
            deptcombobox.addItem("Computer Science");
            deptcombobox.addItem("Civil");
            deptcombobox.addItem("Electrical");
            deptcombobox.addItem("Electronics & Communication");
            deptcombobox.addItem("Information Technology");
            deptcombobox.addItem("Mechanical Engineering");
            studentRegPage.add(deptcombobox);


            JLabel feeStatuslbl = new JLabel("Admission Fees Status :");
            feeStatuslbl.setFont(new Font("Arial", Font.PLAIN, 15));
            feeStatuslbl.setBounds(150,565,150,20);
            feeStatuslbl.setHorizontalAlignment(SwingConstants.RIGHT);
            studentRegPage.add(feeStatuslbl);


            JComboBox<String> feesStatusbox = new JComboBox<String>();
            feesStatusbox.setFont(new Font("Arial", Font.PLAIN, 15));
            feesStatusbox.setBounds(320,565,250,25);
            feesStatusbox.addItem("Paid");
            feesStatusbox.addItem("Unpaid");
             studentRegPage.add(feesStatusbox);


        JButton registerButton = new JButton("Register");
        registerButton.setBounds(350,610,156,45);
        registerButton.setFont(new Font("Arial", Font.BOLD, 20));
        studentRegPage.add(registerButton);























        studentRegPage.setLayout(null);
        studentRegPage.setVisible(true);
        studentRegPage.setSize(795,720);
        studentRegPage.setLocationRelativeTo(null);
        studentRegPage.getContentPane().setBackground(new Color(145, 246, 255));

    }

    public static void main(String[] args) {
        new studentRegistraionForm();
    }
}
