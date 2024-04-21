import java.sql.*;
public class prepare {
    
    public static void main(String[] args) throws ClassNotFoundException {
    
        try {

            try{


            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aman2","root","Amanavi12@@");
            
            PreparedStatement st = con.prepareStatement("select * from class where name= ?");
             st.setString(1, "aman");
            ResultSet s = st.executeQuery();
             while (s.next()) {
                String name = s.getString(1);
                String sec = s.getString(2);
                int id = s.getInt(3);

                System.out.println();
                System.out.println(name);
                System.out.println(sec);
                System.out.println(id);

            System.out.println("inserted");
             }


                
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }


        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());

        }
        
    }

    
}
