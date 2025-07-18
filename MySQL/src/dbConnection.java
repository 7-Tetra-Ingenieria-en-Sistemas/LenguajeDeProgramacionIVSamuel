import java.sql.*;
public class dbConnection {
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String password = "1234";

    public static Connection connect(){
        Connection con=null;
        try{
            con=DriverManager.getConnection(url,user,password);
            System.out.println("Conexión exitosa");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
