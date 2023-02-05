class Test extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread");
		}			
	}	
}
public class ExtendsThreadClass {

	public static void main(String[] args) {
		Test t=new Test();
		t.start();

		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread");
		}	
	}

}
