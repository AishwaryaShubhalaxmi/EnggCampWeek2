package setInterface;
import java.util.*;
public class HashSetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet<String> hs= new HashSet<String>();	
      hs.add("Red");
      hs.add("Blue");
      hs.add("Green");
      hs.add("Pink");
      hs.add("Brown");
      hs.add("Red");                          //Does not take duplicate values
      System.out.println(hs.size());
      
      Iterator<String> it= hs.iterator();      //Prints in random order
      while(it.hasNext()){
    	  System.out.println(it.next());
      }
      
	
	
	}

}
