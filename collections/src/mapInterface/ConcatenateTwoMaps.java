package mapInterface;
import java.util.*;
public class ConcatenateTwoMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Integer,String> hm= new HashMap<Integer,String>();
      hm.put(1, "red");
      hm.put(2, "yellow");
      hm.put(3, "blue");
      HashMap<Integer,String> hm1= new HashMap<Integer,String>();
      hm1.put(4, "pink");
      hm1.put(5, "green");
      hm1.put(6, "brown");
      
      Set<Map.Entry<Integer, String>> set=hm1.entrySet();
     for(Map.Entry<Integer, String> m:set)
     {
    	hm.put(m.getKey(),m.getValue());
     }
     for(Map.Entry<Integer,String> m1:hm.entrySet())
     {
    	 System.out.println(m1.getKey()+" "+m1.getValue());
     }
	}

}
