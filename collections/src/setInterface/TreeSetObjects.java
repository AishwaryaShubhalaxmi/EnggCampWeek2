package setInterface;
import java.util.*;
class Book implements Comparable<Book>{
	int id;
	String name,author;
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public int compareTo(Book b){
		 if(id>b.id){  
		        return 1;  
		    }else if(id<b.id){  
		        return -1;  
		    }else{  
		    return 0;  
		    }  
		}  
	}

public class TreeSetObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeSet<Book> ts= new TreeSet<Book>();
     Book b1= new Book(300,"Ncert maths","abc");
     Book b2= new Book(121,"Ncert english","xyz");
     Book b3= new Book(202,"Hindi","pqr");
     
     ts.add(b1);
     ts.add(b2);
     ts.add(b3);
     
     for(Book b: ts){
    	 System.out.println(b.name + " " + b.id + " " + b.author);
     }
	}

}
