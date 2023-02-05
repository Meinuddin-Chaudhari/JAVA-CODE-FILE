
class MyThread2 extends Thread
{
 @Override
 public void run()
  {
    for (int i=1;i<=5 ;i++ )
    {
    System.out.println("child thread");
    Thread.yield();
    }
  }
}
public class YieldMethod1{
	public static void main(String[] args) {
		
			MyThread2 t= new MyThread2();
			t.setPriority(7);
			t.start();
			for (int i=1; i<=5; i++)
			{
			System.out.println("main thread");
			}
		
	}
}

