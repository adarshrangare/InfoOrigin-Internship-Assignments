package AWT.AWT.src.com.pkg.awtApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;

public class getDetails {

    public getDetails(){

        Frame frame = new Frame("Get Details");


        Label title = new Label("Student Details");
        title.setBounds(280, 40, 200,40);
        title.setForeground(Color.yellow);
        title.setFont(new Font("Roboto", Font.BOLD,20));
        title.setAlignment(Label.CENTER);
        frame.add(title);


        Label stuId = new Label("Student ID: ");
        stuId.setBounds(160,100,100,25);
        stuId.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        stuId.setForeground(Color.white);
        frame.add(stuId);

        Button btngetDetail = new Button("Get Details");
        btngetDetail.setBounds(500, 100, 100, 30);
        btngetDetail.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        btngetDetail.setBackground(new Color(112,212,0));
        btngetDetail.setForeground(Color.WHITE);
        frame.add(btngetDetail);



        TextField stuIdField = new TextField();
        stuIdField.setBounds(300,100,180,25);
        stuIdField.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        stuIdField.setForeground(Color.BLACK);
        frame.add(stuIdField);


        Label fName = new Label("First Name: ");
        fName.setBounds(160,140,100,25);
        fName.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        fName.setForeground(Color.white);
        frame.add(fName);


        Label fNameField = new Label();
        fNameField.setBounds(300,140,280,25);
        fNameField.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        fNameField.setForeground(Color.WHITE);
        frame.add(fNameField);




        Label lName = new Label("Last Name: ");
        lName.setBounds(160,180,100,25);
        lName.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        lName.setForeground(Color.white);
        frame.add(lName);

        Label lNameField = new Label();
        lNameField.setBounds(300,180,280,25);
        lNameField.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        lNameField.setForeground(Color.WHITE);
        frame.add(lNameField);

        Label fatherName = new Label("Father's Name: ");
        fatherName.setBounds(132,220,120,25);
        fatherName.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        fatherName.setForeground(Color.white);
        frame.add(fatherName);

        Label fatherNameField = new Label();
        fatherNameField.setBounds(300,220,280,25);
        fatherNameField.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        fatherNameField.setForeground(Color.WHITE);
        frame.add(fatherNameField);

        Label gender = new Label("Gender: ");
        gender.setBounds(180,255,100,25);
        gender.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        gender.setForeground(Color.white);
        frame.add(gender);
        TextField choseGender = new TextField();

        Label genderans = new Label();
        genderans.setBounds(300,250,80,30);
        genderans.setForeground(Color.white);
        genderans.setFont(new Font("Roboto", Font.TRUETYPE_FONT,14));
        frame.add(genderans);



        Label agelbl = new Label("Date of Birth:(DD/MM/YYYY) ");
        agelbl.setBounds(30,290,220,25);
        agelbl.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        agelbl.setForeground(Color.white);
        frame.add(agelbl);



        Label ageans = new Label();
        ageans.setBounds(300,290,150,25);
        ageans.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        ageans.setForeground(Color.WHITE);
        frame.add(ageans);

        Label course = new Label("Course: ");
        course.setBounds(180,330,120,25);
        course.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        course.setForeground(Color.white);
        frame.add(course);

        Label coursefield = new Label();
        coursefield.setBounds(300,330,280,25);
        coursefield.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        coursefield.setForeground(Color.WHITE);
        frame.add(coursefield);

        Label email = new Label("Email: ");
        email.setBounds(180,370,120,25);
        email.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        email.setForeground(Color.white);
        frame.add(email);

        Label emailfield = new Label();
        emailfield.setBounds(300,370,280,25);
        emailfield.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        emailfield.setForeground(Color.WHITE);
        frame.add(emailfield);

        Label contact = new Label("Contact: ");
        contact.setBounds(180,410,120,25);
        contact.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        contact.setForeground(Color.white);
        frame.add(contact);

        Label countrycode = new Label("+91");
        countrycode.setBounds(300,410,40,25);
        countrycode.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        countrycode.setForeground(Color.WHITE);
        frame.add(countrycode);

        Label contactfield = new Label();
        contactfield.setBounds(350,410,230,25);
        contactfield.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        contactfield.setForeground(Color.white);
        frame.add(contactfield);

        Label address = new Label("Address: ");
        address.setBounds(180,450,120,25);
        address.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        address.setForeground(Color.white);
        frame.add(address);

        TextArea addfield = new TextArea();
        addfield.setBounds(300,450,280,75);
        addfield.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        addfield.setBackground(new Color(43, 43, 43));
        addfield.setForeground(Color.WHITE);
        frame.add(addfield);


        Button registerPage = new Button("Register Yourself");
        registerPage.setBounds(300, 560, 220, 40);
        registerPage.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        registerPage.setBackground(new Color(71, 189, 255));
        registerPage.setForeground(Color.WHITE);
        frame.add(registerPage);

        registerPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new com.pkg.awtApplication.StudentForm();
                frame.dispose();
            }
        });



        btngetDetail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String url = "jdbc:mysql://localhost:3306/jdbcdemo";
                String user = "root";
                String password ="Adarsh@7824";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, user, password);

                    Statement statement = connection.createStatement();

                    String rollno = stuIdField.getText();
                    String query = "select * from Student_details where student_id = ?";
                    PreparedStatement rs = connection.prepareStatement(query);
                    rs.setString(1,rollno);
                    ResultSet rs1 = rs.executeQuery();
                    int id = 0;
                    String firstName = "";
                    String LastName = "";
                    String fatherName = "";
                    String genderN = "";
                    int age = 0;
                    String courseName = "";
                    String EmailId = "";
                    String Contactnumber ="";
                    String addressdetail ="";

                    while (rs1.next()) {

                        id = rs1.getInt(1);
                        firstName = rs1.getString(2);
                        LastName = rs1.getString(3);
                        fatherName = rs1.getString(4);
                        genderN = rs1.getString(5);
                        age = rs1.getInt(6);
                        courseName = rs1.getString(7);
                        EmailId = rs1.getString(8);
                        Contactnumber = rs1.getString(9);
                        addressdetail = rs1.getString(10);


                    }
                    connection.close();

                    if(id !=0){

                        String idString = Integer.toString(id);
                        ageans.setText(idString);

                        String ageString = Integer.toString(age);
                        ageans.setText(ageString);



                        fNameField.setText(firstName);
                        lNameField.setText(LastName);
                        stuIdField.setText(idString);
                        emailfield.setText(EmailId);
                        coursefield.setText(courseName);
                        fatherNameField.setText(fatherName);
                        addfield.setText(addressdetail);
                        ageans.setText(ageString);
                        genderans.setText(genderN);
                        contactfield.setText(Contactnumber);
                    } else{
                        JOptionPane.showMessageDialog(frame, "Enrollement is not registered", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                }
                catch(Exception e3){
                    System.out.println(e);
                }





                JOptionPane.showMessageDialog(frame, "Data is Fetched", "Data Fetched", JOptionPane.PLAIN_MESSAGE);



            }
        });





        frame.setBackground(new Color(43, 43, 43));
        frame.setLayout(null);
        frame.setSize(720,700);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });


    }

    public static void main(String[] args) {
        new getDetails();
    }
}
