interface Left3
{
	public void methodOne();
}

interface Right3
{
	public void methodOne();//put int
	}

class Test3 implements Left3,Right3
{
    public void methodOne()
   {
   System.out.println("hello");
  }
}
public class SameMethodnameAndparameterButReturntypeDifferentInInterface {

	public static void main(String[] args) {
		
    Test3 t=new Test3();
    t.methodOne();
	}
}
