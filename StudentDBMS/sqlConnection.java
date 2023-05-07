package com.pkg.StudentDBMS;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class sqlConnection {

    public sqlConnection(){

        String url = "jdbc:mysql://localhost:3306/studentdbms";
        String user = "root";
        String password ="Adarsh@7824";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();

        String sql= "";

        PreparedStatement pst = connection.prepareStatement(sql);

        pst.executeUpdate();

        ResultSet resultSet = null;

        connection.close();

    }
                catch (Exception e1){
        System.out.println(e1);
    }
    }

    public static void main(String[] args) {
        new sqlConnection();
    }
}
