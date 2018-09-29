package jdbc;
import java.sql.*;
import java.util.*;
public class UpdateARecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try{
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Welcome123");  
		  
	       PreparedStatement stmt=con.prepareStatement("update student1 set name=? where id=?");  
	       stmt.setString(1,"Addi");
	       stmt.setInt(2,2);
	       int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
	}

}
