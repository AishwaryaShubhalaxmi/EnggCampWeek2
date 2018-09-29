package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class PropertiesConnection {

	public static Connection getConnection() throws Exception{
		try {
			Class.forName("Config.driver_name");
		}catch (ClassNotFoundException e) {
			throw new Exception(e);
		}
		Connection con;
		try {
	    con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","Welcome123");  
		}catch(Exception e) {
			throw new Exception (e);
			
		}
		return con;
		
	}
}
