package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;
public class StudentRepository {

    Connection connection = null;
    Statement statement = null;

    public StudentRepository() {
        System.out.println("default Constructor");
        try {
            //Class.forName("com.mysql.jdbc.Driver");//
            String url = "jdbc:mysql://127.0.0.1:3306/student";
            connection = DriverManager.getConnection(url, "root", "Sudha@5343");
            statement = connection.createStatement();
        } catch (Exception ex) {
        }
    }

    //public class StudentRepository {//
    public void save(Student student) throws Exception {
        /*Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.01:3306/student", "root", "Sudha@5343");
        Statement stmt = con.createStatement();*/
        String query = "insert into student" +
                " values('" + student.getId() + "','" + student.getName() + "','" + student.getBranch() + "','" + student.getCollege() + "');";
        System.out.println(query);
        statement.executeUpdate(query);

    }

    public void saveV2(Student student) throws Exception {
        String query = "insert into student values(?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, student.getId());
        statement.setString(2, student.getName());
        statement.setString(3, student.getBranch());
        statement.setString(4, student.getCollege());
        statement.executeUpdate();
        System.out.println("successfully inserted");
    }

    public void getAllStudents() throws Exception {
        // String query = " select * from student";//
        ResultSet result = statement.executeQuery("select * from student LIMIT 20");
        while (result.next()) {
            System.out.println(result.getString(1) + " " + " " + result.getString(2) + " " + " " + result.getString(3) + " " + " " + result.getString(4));
        }
    }

    public void getStudentByID(String id) throws Exception {
        String query = " select * from student where id = '" + id + "'";
        ResultSet result = statement.executeQuery(query);
        System.out.println();
        while (result.next()) {
            System.out.println(result.getString(1) + " " + " " + result.getString(2) + " " + " " + result.getString(3) + " " + result.getString(4));

        }
    }
    public void deleteByID(String id) throws Exception{
        PreparedStatement stmt = connection.prepareStatement("delete from student where id=?");
        stmt.setString(1,id);
        int i = stmt.executeUpdate();
        System.out.println(i + "records deleted");
    }
}
