package multithreading;

public class CreateThread1 extends Thread {    //Extending thread class
      public void run() {
    	  System.out.println("Thread is runnning");
      }
	
	public static void main(String[] args) {
		CreateThread1 t= new CreateThread1();   //Class object is same as thread object
		t.start();     //new state to runnable state
	}
}
