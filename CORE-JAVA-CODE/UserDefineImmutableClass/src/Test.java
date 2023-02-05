final class Test 
{
	int i;
	Test(int i){
		this.i = i;
	}
	public Test check(int i){
			if (this.i == i)
				return this;
			else
				return new Test(i);
				
	}
	public static void main(String[] args) 
	{
		Test t1 = new Test(10);
		Test t2 = t1.check(16);
		//Test t3 = t1.modify(100);
		//Test t4 = t3.modify(100);

		System.out.println(t1==t2);//true
		//System.out.println(t1==t3);//false
		//System.out.println(t2==t3);//false
		//System.out.println(t3==t4);//true
	}
}