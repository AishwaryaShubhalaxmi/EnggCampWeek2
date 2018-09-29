package setInterface;

import java.util.*;

public class TreeSetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<String> ts1= new TreeSet<String>();
	      ts1.add("Red");
	      ts1.add("Blue");
	      ts1.add("Green");
	      ts1.add("Pink");
	      ts1.add("Brown");
	      ts1.add("Red");                // Maintains ascending order and doesn't take duplicate elements
	      for(String s: ts1){
	    	  System.out.println(s);
	      }
	}

}
