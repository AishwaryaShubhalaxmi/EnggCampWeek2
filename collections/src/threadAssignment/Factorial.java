package threadAssignment;

import java.util.Scanner;

public class Factorial implements Runnable {
      private int x;
      public Factorial(int x) {
    	  this.x=x;
      }
      public Factorial() {
	
	}
	public void run() {
	
    	 int fact=1;
    	 for(int i=1;i<=x;i++) {
    		 fact=fact*i;
    	 }
    System.out.println(fact);
    	 
      }
}
