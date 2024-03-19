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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Amanavi12@@");
//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from employee");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getInt(3));
con.close();
}
catch(Exception ex)
{
System.out.println(ex);
}

 
        
        
    }
    
}