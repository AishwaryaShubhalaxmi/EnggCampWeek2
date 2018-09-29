package jdbc;
import java.util.*;
import java.sql.*;
public class PrepredStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Welcome123");  
			  
			PreparedStatement stmt=con.prepareStatement("insert into student1 values(?,?,?,?)");  
			  
			stmt.setString(1,"Ratan");  
			stmt.setInt(2,4);
			stmt.setInt(3,25);
			stmt.setString(4,"ME");
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}

}
 //insert a record  