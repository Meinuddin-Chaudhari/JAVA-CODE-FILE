
public class ForeachLoop3Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [][][] ar= {{{10,20,30},{10,20,30},{10,20,30}}};
		
		for(int a[][]:ar)
		{
			for(int elem[]:a)
			{
			   for(int el:elem)
			   {
				   System.out.print(el+" ");  
			   }
			}
		}
	}

}
