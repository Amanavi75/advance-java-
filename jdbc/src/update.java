import java.sql.*;
public class update {
    
    public static void main(String[] args) throws ClassNotFoundException {
    
        try {

            try{


            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aman2","root","Amanavi12@@");
            
            Statement st = con.createStatement();
             st.executeUpdate("update class set name='aman' where id= 1 ");

            System.out.println("updated");


                
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }


        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());

        }
        
    }

    
}
