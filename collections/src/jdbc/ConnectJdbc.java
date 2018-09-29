package jdbc;
import java.util.*;
import java.sql.*;
public class ConnectJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try{
    	   Class.forName("com.mysql.jdbc.Driver");  //load the driver register   
    	   //create connection
    Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","Welcome123");  
    
    	 Statement stmt=con.createStatement();  //create statement
    	 ResultSet rs=stmt.executeQuery("select * from student1");  //execute query
    	 while(rs.next())  
    	 System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3) + " " +rs.getString(4));  
    	 con.close();   //close connection
    	 }catch(Exception e){ System.out.println(e);}  
    	 }  
       
       
	}

//retrieve all records
