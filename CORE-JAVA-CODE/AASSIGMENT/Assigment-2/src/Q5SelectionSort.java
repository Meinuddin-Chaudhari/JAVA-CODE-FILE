
public class Q5SelectionSort {

	public static void main(String[] args) {
int [] ar= {34,12,76,50,20,90};
		
		for(int i=0;i<ar.length;i++)
		{
			int m=i;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[m])
				{
					m=j;
				}
			}
			int temp=ar[m];
			ar[m]=ar[i];
			ar[i]=temp;
		}	
		for(int ele:ar)
		{
		System.out.println(ele);	
		}
	}
}
