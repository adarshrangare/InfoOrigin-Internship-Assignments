package com.pkg.awtApplication;

import AWT.AWT.src.com.pkg.awtApplication.getDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import static java.lang.PublicMethods.Key.matches;


public class StudentForm  {


//    public SqlConnection() {
//
//    }

    static String gend = "a";



    public StudentForm() {





        Frame frame = new Frame("Student Registration Form");

        Label title = new Label("Student Registration");
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


        TextField fNameField = new TextField();
        fNameField.setBounds(300,140,280,25);
        fNameField.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        fNameField.setForeground(Color.BLACK);
        frame.add(fNameField);




        Label lName = new Label("Last Name: ");
        lName.setBounds(160,180,100,25);
        lName.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        lName.setForeground(Color.white);
        frame.add(lName);

        TextField lNameField = new TextField();
        lNameField.setBounds(300,180,280,25);
        lNameField.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        lNameField.setForeground(Color.BLACK);
        frame.add(lNameField);

        Label fatherName = new Label("Father's Name: ");
        fatherName.setBounds(132,220,120,25);
        fatherName.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        fatherName.setForeground(Color.white);
        frame.add(fatherName);

        TextField fatherNameField = new TextField();
        fatherNameField.setBounds(300,220,280,25);
        fatherNameField.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        fatherNameField.setForeground(Color.BLACK);
        frame.add(fatherNameField);

        Label gender = new Label("Gender: ");
        gender.setBounds(180,255,100,25);
        gender.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        gender.setForeground(Color.white);
        frame.add(gender);
        TextField choseGender = new TextField();

        CheckboxGroup genders = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genders,false);
        male.setBounds(300,250,80,30);
        male.setForeground(Color.white);
        male.setFont(new Font("Roboto", Font.TRUETYPE_FONT,14));
        frame.add(male);

        Checkbox female = new Checkbox("Female", genders,false);
        female.setBounds(380,250,80,30);
        female.setFont(new Font("Roboto", Font.TRUETYPE_FONT,14));
        female.setForeground(Color.white);
        frame.add(female);

        Checkbox others = new Checkbox("Others", genders,false);
        others.setBounds(460,250,80,30);
        others.setForeground(Color.white);
        others.setFont(new Font("Roboto", Font.TRUETYPE_FONT,14));
        frame.add(others);

        Label dob = new Label("Date of Birth:(DD/MM/YYYY) ");
        dob.setBounds(30,290,220,25);
        dob.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        dob.setForeground(Color.white);
        frame.add(dob);



        TextField dobfield = new TextField();
        dobfield.setBounds(300,290,150,25);
        dobfield.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        dobfield.setForeground(Color.BLACK);
        frame.add(dobfield);

        Label course = new Label("Course: ");
        course.setBounds(180,330,120,25);
        course.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        course.setForeground(Color.white);
        frame.add(course);

        TextField coursefield = new TextField();
        coursefield.setBounds(300,330,280,25);
        coursefield.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        coursefield.setForeground(Color.BLACK);
        frame.add(coursefield);

        Label email = new Label("Email: ");
        email.setBounds(180,370,120,25);
        email.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        email.setForeground(Color.white);
        frame.add(email);

        TextField emailfield = new TextField();
        emailfield.setBounds(300,370,280,25);
        emailfield.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        emailfield.setForeground(Color.BLACK);
        frame.add(emailfield);

        Label contact = new Label("Contact: ");
        contact.setBounds(180,410,120,25);
        contact.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        contact.setForeground(Color.white);
        frame.add(contact);

        TextField countrycode = new TextField("+91");
        countrycode.setBounds(300,410,40,25);
        countrycode.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        countrycode.setForeground(Color.BLACK);
        frame.add(countrycode);

        TextField contactfield = new TextField();
        contactfield.setBounds(350,410,230,25);
        contactfield.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        contactfield.setForeground(Color.BLACK);
        frame.add(contactfield);

        Label address = new Label("Address: ");
        address.setBounds(180,450,120,25);
        address.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        address.setForeground(Color.white);
        frame.add(address);

        TextArea addfield = new TextArea();
        addfield.setBounds(300,450,280,75);
        addfield.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        addfield.setForeground(Color.BLACK);
        frame.add(addfield);

        Button btnsave = new Button("Register");
        btnsave.setBounds(300, 560, 120, 40);
        btnsave.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        btnsave.setBackground(new Color(53,180,81));
        btnsave.setForeground(Color.WHITE);
        frame.add(btnsave);




        Button btnreset = new Button("Reset Details");
        btnreset.setBounds(440, 560, 120, 40);
        btnreset.setFont(new Font("Roboto", Font.TRUETYPE_FONT,16));
        btnreset.setBackground(new Color(182,53,81));
        btnreset.setForeground(Color.WHITE);
        frame.add(btnreset);




        btnreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("reset");


                    fNameField.setText("");
                    lNameField.setText("");
                    stuIdField.setText("");
                    emailfield.setText("");
                    coursefield.setText("");
                    fatherNameField.setText("");
                    addfield.setText("");
                    dobfield.setText("");
                    male.setState(false);
                    female.setState(false);
                    others.setState(false);
                    contactfield.setText("");

            }
        });

        btngetDetail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new getDetails();
                frame.dispose();
            }
        });

        btnsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String studentID = stuIdField.getText();
                if (studentID.isEmpty() || !studentID.matches("[0-9]+")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid Student ID", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String firstName = fNameField.getText();
                if (firstName.isEmpty() || !firstName.matches("[a-zA-Z\\s]+")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid first Name", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                 String lastName = lNameField.getText();
                if (lastName.isEmpty() || !lastName.matches("[a-zA-Z\\s]+")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid Last Name", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String fatherName = fatherNameField.getText();
                if (fatherName.isEmpty() || !fatherName.matches("[a-zA-Z\\s]+")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid Father's Name", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String coursefields = coursefield.getText();
                if (coursefields.isEmpty() || !coursefields.matches("[a-zA-Z\\s]+")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid Course", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
//
//
                    String contactNum = contactfield.getText();
                    if (!contactNum.matches("[0-9]+") || contactNum.length()<10 ) {
                        JOptionPane.showMessageDialog(frame, "Please enter a valid Contact Number", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                String emailadd = emailfield.getText();
                String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
                Pattern pattern = Pattern.compile(emailRegex);
                Matcher matcher = pattern.matcher(emailadd);


                if(!( matcher.matches())){
                    JOptionPane.showMessageDialog(frame, "Please enter a valid email address.", "Invalid email", JOptionPane.ERROR_MESSAGE);
                      return;
                }

                String dateOfBirth = dobfield.getText();
                if(dateOfBirth.isEmpty() || !dateOfBirth.matches("^\\d{2}/\\d{2}/\\d{4}$")){
                    JOptionPane.showMessageDialog(frame, "Please enter a valid Date of Birth.", "Invalid DOB", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if(!(male.getState()) && !(others.getState()) && !(female.getState())){
                    JOptionPane.showMessageDialog(frame, "Please Select Gender.", "Invalid Gender", JOptionPane.ERROR_MESSAGE);
                    return;
                }


                String dobString = dobfield.getText();
                   String[] ddmmyyyy = dobString.split("/");

                   String yyyymmddd = ddmmyyyy[2] + "-" + ddmmyyyy[1] + "-" + ddmmyyyy[0];
                   LocalDate dob = LocalDate.parse(yyyymmddd);
                   LocalDate currentDate = LocalDate.now();
                   Period age = Period.between(dob, currentDate);
                   System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");



                if(male.getState()){
                    gend = "male";
                    choseGender.setText("Male");
                }
                else if (female.getState()){
                    gend = "female";
                    choseGender.setText("Female");
                } else if(
                        others.getState()){
                    gend = "Other";
                    choseGender.setText("Other");
                }

                System.out.println(choseGender.getText());


                String url = "jdbc:mysql://localhost:3306/jdbcdemo";
                    String user = "root";
                    String password ="Adarsh@7824";
                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection connection = DriverManager.getConnection(url,user,password);

                    Statement statement = connection.createStatement();

                    String sql= "insert into Student_details(Student_id,FirstName,LastName,FatherName,Gender,Age,course,Email,Contact,Address)\n" +
                            "Values(?,?,?,?,?,?,?,?,?,?)";

                    PreparedStatement pst = connection.prepareStatement(sql);

                    pst.setInt(1, Integer.parseInt(stuIdField.getText()));
                    pst.setString(2,fNameField.getText());
                    pst.setString(3,lNameField.getText());
                    pst.setString(4,fatherNameField.getText());
                    pst.setString(5,choseGender.getText());
                    pst.setInt(6,age.getYears());
                    pst.setString(7,coursefield.getText());
                    pst.setString(8,emailfield.getText());
                    pst.setString(9,contactfield.getText());
                    pst.setString(10,addfield.getText());


                    pst.executeUpdate();

                        fNameField.setText("");
                        lNameField.setText("");
                        stuIdField.setText("");
                        emailfield.setText("");
                        coursefield.setText("");
                        fatherNameField.setText("");
                        addfield.setText("");
                        dobfield.setText("");
                        male.setState(false);
                        female.setState(false);
                        others.setState(false);
                        contactfield.setText("");


                        ResultSet  resultSet = statement.executeQuery("Select * from Student_details");

                    while(resultSet.next()){
                        System.out.println(resultSet.getInt(1)+" || " + resultSet.getString(2) +" || " + resultSet.getString(3) +" || " + resultSet.getString(4));


                    }
                    connection.close();



                }
                catch (Exception e1){
                    System.out.println(e1);
                }



                JOptionPane.showMessageDialog(frame, "Details are Updated");
                System.out.println("Data is updated in Database");




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



         new StudentForm();


    }

}
