package jdbc;
import java.sql.*;
import java.io.*;
public class StoredProcedureNInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try{
    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ProblemStatement","root","Welcome123");
    	  CallableStatement stmt=con.prepareCall("{call solution(?,?,?,?,?)}");  
    	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  	    
    	  do{  
    	   System.out.println("enter id:");  
    	  int id=Integer.parseInt(br.readLine());
    	  System.out.println("enter name:"); 
    	  String name=br.readLine(); 
    	  System.out.println("enter email:"); 
    	  String email=br.readLine();
    	  System.out.println("enter phone:"); 
    	  String phone=br.readLine();
    	  System.out.println("enter dob");
    	  String dob=br.readLine();
    	  
    	  stmt.setInt(1,id);  
    	  stmt.setString(2,name); 
    	  stmt.setString(3,email);
    	  stmt.setString(4, phone);
    	  stmt.setString(5,dob);
    	  stmt.execute();  
  	       System.out.println("success");  
  	     System.out.println("Do you want to continue: y/n");  
   	  String s=br.readLine();  
   	  if(s.startsWith("n")){  
   	  break;  
   	  }  
   	  }while(true);  
      con.close();  
  	   }catch(Exception e)
      { System.out.println(e);}  

    		  
    	  }
    	 
      
	}

