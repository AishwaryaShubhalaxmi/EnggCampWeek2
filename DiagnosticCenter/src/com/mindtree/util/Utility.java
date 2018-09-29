package com.mindtree.util;
import java.sql.*;
/**
 * 
 * @author M1046926
 *
 */
public class Utility {

	
	private static Connection con;
	/**
	 * 
	 * 
	 * @return
	 */
	
    public static Connection getConnection() {
    	try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ProblemStatement","root","Welcome123");
			
		}catch(Exception e){ System.out.println(e);} 
		 
		return con;
    }
    /**
     * 
     */
    
    public static void closeConnection() {
    	try 
		{
			con.close();
		} catch(Exception e){ System.out.println(e);} 
    	
	}
    }


