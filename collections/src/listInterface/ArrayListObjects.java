package listInterface;
import java.util.*;
class Student{
	String name;
	int rollNo;
	double marks;
	public Student(String name, int rollNo, double marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
}
public class ArrayListObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1= new Student("Aish",1,25);   //create objects
       Student s2= new Student("Aman",3,24);
       Student s3= new Student("Ankita",5,27);
       
       ArrayList<Student> arr= new ArrayList<Student>();   //create arraylist
       
       arr.add(s1);   //add objects to arraylist
       arr.add(s2);
       arr.add(s3);
       
    /*   for(Student s:arr){         //traversing the elements
    	   System.out.println(s.name + " " + s.rollNo + " " + s.marks);
       }*/
       
       Iterator<Student> itr= arr.iterator();      //traversing the list using iterator
       while(itr.hasNext()){
    	   Student s= itr.next();
    	   System.out.println(s.name + " " + s.rollNo + " " + s.marks);
       }
	}

}
