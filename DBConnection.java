package travelzilla;
import java.sql.*;
public class DBConnection {
    Connection connection=null;
    public Connection createConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines", "root", "....");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return connection;
    }
}
