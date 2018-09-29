package listInterface;
import java.util.*;
public class ArrayListsCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> arr= new ArrayList<String>();     //arrayList declaration
       arr.add("Red");
       arr.add("Blue");
       arr.add("Green");
       System.out.println(arr);
       for(String s:arr){          //traversing using for each loop
    	   System.out.println(s);
       }
      System.out.println(arr.get(2)); //returns the value at the given index
       
       arr.set(2, "Pink"); //inserts the element at the given index removing the previous one
       arr.add(1,"Black");  //inserts the element at the given index
       ArrayList<String> arr1= new ArrayList<String>();
       arr1.add("abc");
       arr1.add("xyz");
       arr1.add("pqr");
       arr1.add("Red");
       Iterator<String> it= arr1.iterator();    //traversing the list using iterator
       while(it.hasNext()){
    	   System.out.println(it.next());
       }
       arr.addAll(arr1);          //adds the two lists
        System.out.println(arr);
       arr.retainAll(arr1);       //retains the common elements
         System.out.println(arr);
       arr.removeAll(arr1);       /*removes all the elements of the second list  
                                           including the elements that are repeated*/
       System.out.println(arr); 
      
	}

}
