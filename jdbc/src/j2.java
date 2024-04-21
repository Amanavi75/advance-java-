/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.sql.*;
 /**
  *
  * @author dell
  */
 public class j2 {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         
        try
 {
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Amanavi12@@");
 //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava");
 //Statement stmt=con.createStatement();
 //String query="create table student(stuid int,stuname varchar(40))";
//String ins="insert into student values(1,'shruti')";
//stmt.executeUpdate("update student set stuname=\"mohan\" where stuid=1");
//stmt.executeUpdate(ins);
PreparedStatement stmt = con.prepareStatement("insert into student values(?,?)");
stmt.setInt(1, 101);
stmt.setString(2, "shruti");
stmt.executeUpdate();
stmt.close();

con.close();
 }
 catch(Exception ex)
 {
 System.out.println(ex);
 }
 
    }
     
 }