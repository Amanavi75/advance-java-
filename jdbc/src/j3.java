import java.sql.*;
    
public class j3 {
    
        public static void main(String[] args) throws ClassNotFoundException {
    
            try {
    
                try{
    
    
                Class.forName("com.mysql.cj.jdbc.Driver");
    
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aman2","root","Amanavi12@@");
                
                Statement st = con.createStatement();
                 st.executeUpdate("Insert into class value('hemu','cp',3)");

                System.out.println("inserted");

    
                    
                }catch(SQLException e){
                    System.out.println(e.getMessage());
                }
    
    
            }catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
    
            }
            
        }
    
        
    }
