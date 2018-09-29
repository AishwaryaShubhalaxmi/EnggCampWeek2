package multithreading;

public class CreateThread2 implements Runnable {     //implementing runnable interface
    public void run() {
    	System.out.println("Thread is running");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CreateThread2 m=new CreateThread2();   //class object
      Thread t1= new Thread(m); //converting class object explicitly to thread object
      t1.start();
      
	}

}
