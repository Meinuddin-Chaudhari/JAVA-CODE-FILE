
public class RunnableInterfaceUsingAnnonynousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable(){
			@Override
			public void run(){

			for (int i = 1;i<=5 ;i++ )
			{

			System.out.println("child thread");

			}
			}
			}
			).start();
	}

}
