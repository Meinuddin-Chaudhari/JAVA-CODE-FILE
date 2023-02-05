class A extends Thread
{
	public synchronized void d1(B b){
		System.out.println("Thread-1 starts execution of d1()");
		try{
			Thread.sleep(5000);//5sec
		}
		catch (InterruptedException e){
		}
		System.out.println("Thread-1 trying to call B last()");
		b.last();
	}
	public synchronized void last(){
		System.out.println("Inside A last() method");
	}
}

class B extends Thread
{
	public synchronized void d2(A a){
		System.out.println("Thread-2 starts execution of d2()");
		try{
			Thread.sleep(5000);//5sec
		}
		catch (InterruptedException e){
		}
		System.out.println("Thread-2 trying to call A last()");
		a.last();
	}
	public synchronized void last(){
		System.out.println("Inside B last() method");
	}
}
public class Deadlock extends Thread {
	 A a=new A();
	 B b=new B();

	 public void m1(){
		this.start();
		a.d1(b);//line executed by main thread
	 }

	 public void run(){
		b.d2(a);//line executed by child thread
	 }

	public static void main(String[] args){
	 Deadlock t=new Deadlock();
		t.m1();//main thread s executing
	}
}