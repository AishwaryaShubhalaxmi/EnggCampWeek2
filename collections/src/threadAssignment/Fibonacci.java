 package threadAssignment;

public class Fibonacci extends Thread {
	
	private int n;int a=0;int b=1;
	 public Fibonacci(int a, int b) {
		 this.a=a;
		 this.b=b;
	 }
	public Fibonacci() {

	}
	public void run() {
		for(int j=0;j<=n;j++) {
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
		}
	
	}
	
} 
