package jdbc;
import java.util.*;
import java.sql.*;
public class DeleteARecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Welcome123");  
			  
		       PreparedStatement stmt=con.prepareStatement("delete from student1 where id=?");  
		       stmt.setInt(1,4); //1 is the number of parameter
		       int i=stmt.executeUpdate();  
				System.out.println(i+" records inserted");  
				  
				con.close();  
				  
				}catch(Exception e){ System.out.println(e);}  
	}

}
