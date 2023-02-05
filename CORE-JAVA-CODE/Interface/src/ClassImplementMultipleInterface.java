interface One
  {
     void methodOne();
  }

interface Two
  {
	void methodTwo();
  }

class Demo implements One,Two
{
   public void methodOne()
   {	  
	   System.out.println("method one");
   }
   public void methodTwo()
   {
	  System.out.println("method method");
   }
}

public class ClassImplementMultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Demo d =new Demo();
         d.methodOne();
         d.methodTwo();
	}

}
