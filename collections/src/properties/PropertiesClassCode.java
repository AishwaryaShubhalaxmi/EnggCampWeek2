package properties;
import java.util.*;
import java.io.*;
public class PropertiesClassCode {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        FileReader reader= new FileReader("Assign.properties");
        Properties p=new Properties();
        p.load(reader);
        
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
       
	}

}


//To read the contents of the properties file