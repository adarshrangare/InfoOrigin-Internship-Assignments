package com.pkg.StudentDBMS;

import javax.swing.*;
import java.awt.*;

public class studentDetails {

    public studentDetails(){


        JFrame studentDetailPage = new JFrame("Student Details");

        JLabel studentReglabel = new JLabel("Student Details");
        studentReglabel.setFont(new Font("Arial", Font.BOLD, 24));
        studentReglabel.setBounds(300,20,300,40);
        studentDetailPage.add(studentReglabel);


        JLabel personallbl = new JLabel("Personal Details");
        personallbl.setFont(new Font("Arial", Font.BOLD, 18));
        personallbl.setBounds(310,50,300,40);
        studentDetailPage.add(personallbl);


        JLabel studentName = new JLabel("Name :");
        studentName.setFont(new Font("Arial", Font.PLAIN, 15));
        studentName.setBounds(150,100,150,20);
        studentName.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(studentName);


        JLabel studentNameTf = new JLabel("_");
        studentNameTf.setFont(new Font("Arial", Font.PLAIN, 15));
        studentNameTf.setBounds(320,100,250,25);
        studentDetailPage.add(studentNameTf);



        JLabel enrollmentNo = new JLabel("Enrollment No. :");
        enrollmentNo.setFont(new Font("Arial", Font.PLAIN, 15));
        enrollmentNo.setBounds(150,135,150,20);
        enrollmentNo.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(enrollmentNo);


        JLabel enrollmentNoTf = new JLabel("_");
        enrollmentNoTf.setFont(new Font("Arial", Font.PLAIN, 15));
        enrollmentNoTf.setBounds(320,135,250,25);
        studentDetailPage.add(enrollmentNoTf);



        JLabel fatherName = new JLabel("Father's Name :");
        fatherName.setFont(new Font("Arial", Font.PLAIN, 15));
        fatherName.setBounds(150,170,150,20);
        fatherName.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(fatherName);


        JLabel fatherNameTf = new JLabel("_");
        fatherNameTf.setFont(new Font("Arial", Font.PLAIN, 15));
        fatherNameTf.setBounds(320,170,250,25);
        studentDetailPage.add(fatherNameTf);

        JLabel motherName = new JLabel("Mother's Name :");
        motherName.setFont(new Font("Arial", Font.PLAIN, 15));
        motherName.setBounds(150,205,150,20);
        motherName.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(motherName);


        JLabel motherNameTf = new JLabel("_");
        motherNameTf.setFont(new Font("Arial", Font.PLAIN, 15));
        motherNameTf.setBounds(320,205,250,25);
        studentDetailPage.add(motherNameTf);


        JLabel genderlbl = new JLabel("Gender :");
        genderlbl.setFont(new Font("Arial", Font.PLAIN, 15));
        genderlbl.setBounds(150, 240, 150, 20);
        genderlbl.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(genderlbl);

        JLabel gendertf = new JLabel("_");
        gendertf.setFont(new Font("Arial", Font.PLAIN, 15));
        gendertf.setBounds(320, 240, 80, 25);
        studentDetailPage.add(gendertf);


        JLabel doblbl = new JLabel("Age :");
        doblbl.setFont(new Font("Arial", Font.PLAIN, 15));
        doblbl.setBounds(150,270,150,20);
        doblbl.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(doblbl);


        JLabel dobTf = new JLabel("_");
        dobTf.setFont(new Font("Arial", Font.PLAIN, 15));
        dobTf.setBounds(320,270,250,25);
        studentDetailPage.add(dobTf);


        JLabel emailLbl = new JLabel("Email :");
        emailLbl.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLbl.setBounds(150,305,150,20);
        emailLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(emailLbl);


        JLabel emailTf = new JLabel("_");
        emailTf.setFont(new Font("Arial", Font.PLAIN, 15));
        emailTf.setBounds(320,305,250,25);
        studentDetailPage.add(emailTf);


        JLabel contactlbl = new JLabel("Contact No. :");
        contactlbl.setFont(new Font("Arial", Font.PLAIN, 15));
        contactlbl.setBounds(150,340,150,20);
        contactlbl.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(contactlbl);


        JLabel contactTf = new JLabel("_");
        contactTf.setFont(new Font("Arial", Font.PLAIN, 15));
        contactTf.setBounds(320,340,250,25);
        studentDetailPage.add(contactTf);


        JLabel addressLbl = new JLabel("Address :");
        addressLbl.setFont(new Font("Arial", Font.PLAIN, 15));
        addressLbl.setBounds(150,375,150,20);
        addressLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(addressLbl);


        JLabel addressTa = new JLabel("_");
        addressTa.setFont(new Font("Arial", Font.PLAIN, 15));
        addressTa.setBounds(320,375,250,75);
        studentDetailPage.add(addressTa);


        JLabel deptlbl = new JLabel("Department :");
        deptlbl.setFont(new Font("Arial", Font.PLAIN, 15));
        deptlbl.setBounds(150,460,150,20);
        deptlbl.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(deptlbl);


        JLabel deptName = new JLabel("_");
        deptName.setFont(new Font("Arial", Font.PLAIN, 15));
        deptName.setBounds(320,460,250,25);
        studentDetailPage.add(deptName);


        JLabel feeStatuslbl = new JLabel("Fees Status :");
        feeStatuslbl.setFont(new Font("Arial", Font.PLAIN, 15));
        feeStatuslbl.setBounds(150,495,150,20);
        feeStatuslbl.setHorizontalAlignment(SwingConstants.RIGHT);
        studentDetailPage.add(feeStatuslbl);


        JLabel feesStatus = new JLabel("_");
        feesStatus.setFont(new Font("Arial", Font.PLAIN, 15));
        feesStatus.setBounds(320,495,250,25);
        studentDetailPage.add(feesStatus);





        JButton registerButton = new JButton("Edit Details");
        registerButton.setBounds(350,610,156,45);
        registerButton.setFont(new Font("Arial", Font.BOLD, 20));
        studentDetailPage.add(registerButton);























        studentDetailPage.setLayout(null);
        studentDetailPage.setVisible(true);
        studentDetailPage.setSize(795,720);
        studentDetailPage.setLocationRelativeTo(null);
        studentDetailPage.getContentPane().setBackground(new Color(145, 246, 255));

    }

    public static void main(String[] args) {
        new studentDetails();
    }
}
