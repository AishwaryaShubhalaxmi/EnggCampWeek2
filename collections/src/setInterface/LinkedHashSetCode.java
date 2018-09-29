package setInterface;
import java.util.*;
public class LinkedHashSetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedHashSet<String> hs1= new LinkedHashSet<String>();
      hs1.add("Red");
      hs1.add("Blue");
      hs1.add("Green");
      hs1.add("Pink");
      hs1.add("Brown");
      hs1.add("Red");                // Maintains insertion order and doesn't take duplicate elements
      for(String s: hs1){
    	  System.out.println(s);
      }
      
	}

}
