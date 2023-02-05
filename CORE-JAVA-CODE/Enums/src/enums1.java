enum Result
{
	PASS,FAIL,NR;//PUBLIC STATIC
	
	Result()
	{
		System.out.println("constructor called");
	}	
}
public class enums1 {
	public static void main(String[] args) {
		Result re=Result.PASS;
		System.out.println(re);
		
		Result ar[]=Result.PASS.values();
		for(Result hyder:ar)
		{
			System.out.println(hyder.ordinal()+" "+hyder.name());
		}
	}
}
