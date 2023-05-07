package com.pkg.awtApplication;

import AWT.AWT.src.com.pkg.awtApplication.getDetails;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Homepage
// extended frame class
{
 //Created Constructor
    public Homepage() {

       Frame frame = new Frame("AWT_Example");

                // Label
                Label label = new Label("Homepage");
                label.setBounds(250,120,200,50);
                label.setBackground(new Color(43, 43, 43));
                label.setFont(new Font("Roboto", Font.BOLD,36));
                label.setForeground(Color.white);
                frame.add(label);




            Button StudentRegistrationbtn = new Button("Student Registration");
            StudentRegistrationbtn.setBounds(250,250,215,80);
            StudentRegistrationbtn.setBackground(new Color(0x00B6B6));
            StudentRegistrationbtn.setFont(new Font("Roboto", Font.BOLD,20));
            StudentRegistrationbtn.setForeground(Color.white);
            StudentRegistrationbtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    new com.pkg.awtApplication.StudentForm();

                    label.setText("Clicked Successfully");
                }
            });


//
            frame.add(StudentRegistrationbtn);


                Button getdetailbtn = new Button("Get Details");
                getdetailbtn.setBounds(250,380,200,80);
                getdetailbtn.setBackground(new Color(0x00B6B6));
                getdetailbtn.setFont(new Font("Roboto", Font.BOLD,20));
                getdetailbtn.setForeground(Color.white);
                getdetailbtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        new getDetails();

                        label.setText("Clicked Successfully");
                    }
                });


//                getdetailbtn.setVisible(true);
        frame.add(getdetailbtn);












                //frame property

               frame.setSize(800,700);
               frame.setLayout(null);
               frame.setVisible(true);
               frame.setBackground(new Color(43, 43, 43));

                            //Closing Window with Button
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        frame.dispose();
                    }
                });
    }




    public static void main(String args[]) {

    new com.pkg.awtApplication.Homepage();


    }

}