package threadAssignment;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
     Factorial f=new Factorial();
     Thread t1= new Thread(f);
     
     Fibonacci t2= new Fibonacci();
    
     
      t1.setPriority(Thread.MIN_PRIORITY);
      t2.setPriority(Thread.MAX_PRIORITY);
     
       t1.start();
       t2.start();
     
	}

}
