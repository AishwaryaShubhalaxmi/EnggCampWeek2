package listInterface;
import java.util.*;
public class ListIteratorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> arr= new ArrayList<String>();     //arrayList declaration
	       arr.add("Red");
	       arr.add("Blue");
	       arr.add("Green");
	       arr.add("Black");
	       arr.add("White");
	       
	       System.out.println("Traversing in forward direction");
	       ListIterator<String> lit= arr.listIterator();
	       while(lit.hasNext()){
	    	   System.out.println(lit.next());
	       }
	       System.out.println("Traversing in backward direction");
	       while(lit.hasPrevious()){
	    	   System.out.println(lit.previous());
	       }
	       
	}

}
