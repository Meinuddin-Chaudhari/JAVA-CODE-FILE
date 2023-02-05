class MyThread1 extends Thread
{
 @Override
 public void run()
  {
    for (int i=1;i<=5 ;i++ )
    {
    System.out.println("child thread");
    }
  }
}
public class ThreadPriorityChange {
	public static void main(String[] args) {
		
//			MyThread1 t= new MyThread1();
//			t.setPriority(7);
//			t.start();
//			for (int i=1; i<=5; i++)
//			{
//			System.out.println("main thread");
//			}
		System.out.println(Thread.currentThread().getPriority());//5
		Thread.currentThread().setPriority(7);
		MyThread1 t= new MyThread1();
		System.out.println(Thread.currentThread().getPriority());//7
	}
}

