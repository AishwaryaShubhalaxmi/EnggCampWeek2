package multithreading;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Tire t1=new Tire();
      t1.start();
      Seat t2= new Seat();
      t2.start();
      Engine t3= new Engine();
      t3.start();
      Frame t4= new Frame();
      t4.start();
	}

}
