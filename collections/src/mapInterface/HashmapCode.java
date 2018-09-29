package mapInterface;
import java.util.*;
public class HashmapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> hs= new HashMap<Integer,String>();
      hs.put(1, "Red");
      hs.put(2, "Blue");
      hs.put(3, "Green");
      hs.put(4, "Pink");
      
     /* for(Map.Entry e:hs.entrySet()){
    	  System.out.println(e.getKey() + " " + e.getValue());
      }*/
	   Iterator<Map.Entry<Integer, String>> itr=hs.entrySet().iterator();
	   while(itr.hasNext()) {
		   Map.Entry<Integer, String> entry= itr.next();
		   int key=entry.getKey();
		   String value=entry.getValue();
		   System.out.println("key " + key);
		   System.out.println("value " + value);
	   }
	
	}

}
