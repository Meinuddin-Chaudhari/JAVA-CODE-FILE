class Student extends Thread
{
	public void run()
	{
		System.out.println(10/0);
	}
}
public class ThreadNameChange {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.start();
		
		//user Thread name
		//System.out.println(s.getName());//output
		
		//change uses Thread name
		s.setName("ayan thread");//changing 
		//System.out.println(s.getName());//output
	
		
		
		
		//main Thread name
		//System.out.println(Thread.currentThread().getName());//output
		
		// change main thread name
		Thread.currentThread().setName("meinu thread");//changing
		//System.out.println(Thread.currentThread().getName());//output
		
		
		System.out.println(10/0);
	}

}
