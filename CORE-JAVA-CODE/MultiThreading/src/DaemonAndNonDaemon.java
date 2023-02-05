
class MyThread12 extends Thread{
	public void run(){
		for (int i=1;i<=10 ;i++ ){
			System.out.println("child thread");
			try{
				Thread.sleep(2000);//2sec
			}
			catch (InterruptedException e){
				System.out.println(e);
			}		
		}
	}
}
public class DaemonAndNonDaemon  {
	public static void main(String[] args){
		MyThread12 t=new MyThread12();
		//t.setDaemon(true);//stmt-1
		t.start();
		System.out.println("end of main thread");
      }
}