
    
    import java.sql.*;
    public class delete {

        public static void main(String[] args) throws ClassNotFoundException {
    
            try {
    
                try{
    
    
                Class.forName("com.mysql.cj.jdbc.Driver");
    
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aman2","root","Amanavi12@@");
                
                Statement st = con.createStatement();
                 st.executeUpdate("delete from class where id=3");

                System.out.println("deleted");

    
                    
                }catch(SQLException e){
                    System.out.println(e.getMessage());
                }
    
    
            }catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
    
            }
            
        }
    
        
    }


