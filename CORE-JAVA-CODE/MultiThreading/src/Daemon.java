
class MyThread99 extends Thread{}
public class Daemon  {
	public static void main(String[] args){
		System.out.println(Thread.currentThread().isDaemon());//false
		//Thread.currentThread().setDaemon(true);//RE:IllegalThreadStartException

		MyThread99 t=new MyThread99();
		System.out.println(t.isDaemon());//false
		t.setDaemon(true);
		t.start();
		System.out.println(t.isDaemon());//true	
      }
}