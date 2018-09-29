package jdbc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class TestStoredProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ProblemStatement","root","Welcome123");
	    	  CallableStatement stmt=con.prepareCall("{call solutionA(?,?,?)}");  
	    	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  	    
	    	  do{  
	    	   System.out.println("enter id:");  
	    	  int t_id=Integer.parseInt(br.readLine());
	    	  System.out.println("enter name:"); 
	    	  String name=br.readLine(); 
	    	  System.out.println("enter cost:"); 
	    	  int cost=Integer.parseInt(br.readLine());
	    	 
	    	  stmt.setInt(1,t_id);  
	    	  stmt.setString(2,name); 
	    	  stmt.setInt(3,cost);
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
