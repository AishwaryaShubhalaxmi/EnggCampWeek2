package mapInterface;
import java.util.*;
public class StringStringMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<String,String> hs= new HashMap<String,String>();
    hs.put("key1","Red");
    hs.put("key2","Blue");
    hs.put("key3","Green");
    hs.put("key4","White");
    hs.put("key5","Pink");
	
	 for(Map.Entry<String,String> e: hs.entrySet()) {       
		   System.out.println(e.getKey() + " " + e.getValue());
		   
	 }

}
}