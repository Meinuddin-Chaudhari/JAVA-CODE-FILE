
interface Left1
{
	public void methodOne(int a);
}

interface Right1
{
	public void methodOne();
	}

class Test1 implements Left1,Right1
{
    public void methodOne()
   {
    System.out.println("hello");
   }
    public void methodOne(int a)
    {
     System.out.println(a);
    }
}
public class SameMethodnameAndReturntypeButDifferentParaInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Test1 t=new Test1();
    t.methodOne();
    t.methodOne(10);
	}

}
