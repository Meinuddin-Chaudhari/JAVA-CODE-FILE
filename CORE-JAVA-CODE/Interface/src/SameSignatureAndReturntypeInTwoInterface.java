
interface Left
{
	public void methodOne();
}

interface Right
{
	public void methodOne();
	}

class Test implements Left,Right
{
    public void methodOne()
   {
    System.out.println("hello");
   }
}
public class SameSignatureAndReturntypeInTwoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Test t=new Test();
    t.methodOne();
	}

}
