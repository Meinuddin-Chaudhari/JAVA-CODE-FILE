
public class Q3BubbleSort {

	public static void main(String[] args) {
		 int temp;
			int [] ar= {60,30,9,50,22,45,1,0,2};
			for(int i=0;i<ar.length-1;i++)
			{
				for(int j=0;j<ar.length-1;j++)
				{
					
					if(ar[j]>ar[j+1])
					{
					temp =ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					}
				}
			}
			for(int ele:ar)
			{
				System.out.print(ele+" ");
			}
	}
}
