package properties;
import java.io.*;
public class FileReaderCode {

	public static void main(String[] args) throws Exception{    //throws FileNotFoundException
		// TODO Auto-generated method stub
     FileReader fr= new FileReader("D:\\prog1.txt");    //Reads the file from the given location
     int i;
     while((i=fr.read())!=-1) {   //checks if the file has characters
    	 System.out.print((char)i);
     }
    	 fr.close();
     
	}

}
