package jdbc;
import java.sql.*;
import java.util.*;
public class StoredProcedureExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try{
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Welcome123"); 
    	  CallableStatement stmt=con.prepareCall("{call class1(?,?)}");  
    	  stmt.setInt(1,123);  
    	  stmt.setString(2,"Amit");  
    	  stmt.execute();  
    	    
    	  System.out.println("success");  
    	  con.close();
      }catch(Exception e){
    	  System.out.println(e);
      }
      
	}
}


