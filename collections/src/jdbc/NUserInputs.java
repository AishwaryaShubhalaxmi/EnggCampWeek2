package jdbc;
import java.sql.*;
import java.io.*;
public class NUserInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      try{
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Welcome123");  
	    	  
	    	  PreparedStatement ps=con.prepareStatement("insert into student1 values(?,?,?,?)");  
	    	  
	    	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	    	    
	    	  do{  
	    	  System.out.println("enter name:"); 
	    	  String name=br.readLine(); 
	    	  System.out.println("enter id:");  
	    	  int id=Integer.parseInt(br.readLine());
	    	   
	    	  System.out.println("enter rollNo:");  
	    	  int rollNo=Integer.parseInt(br.readLine());
	    	  
	    	  System.out.println("enter stream:");
	    	  String stream=br.readLine();  
	    	  ps.setString(1,name);  
	    	  ps.setInt(2,id);  
	    	  ps.setInt(3,rollNo);  
	    	  ps.setString(4,stream);
	    	  int i=ps.executeUpdate();  
	    	  System.out.println(i +" records affected");  
	    	    
	    	  System.out.println("Do you want to continue: y/n");  
	    	  String s=br.readLine();  
	    	  if(s.startsWith("n")){  
	    	  break;  
	    	  }  
	    	  }while(true);  
	    	  
	    	  System.out.println("Fetching the values");
	    	  ResultSet rs=ps.executeQuery("select * from student1");  //execute query
	     	 while(rs.next())  
	     	 System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3) + " " +rs.getString(4));  
	    	  con.close();  
	}catch(Exception e){ System.out.println(e);}  

}
}
