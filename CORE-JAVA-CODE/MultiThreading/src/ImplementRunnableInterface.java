class MyThread implements Runnable
{
	public void run()
	{
		
		System.out.println("child thread");
		
	}
}
public class ImplementRunnableInterface {

	public static void main(String[] args) {
		
		MyThread r=new MyThread();
		Thread t=new Thread(r);
		t.start();
	
	    System.out.println("main thread");	
	}
}
