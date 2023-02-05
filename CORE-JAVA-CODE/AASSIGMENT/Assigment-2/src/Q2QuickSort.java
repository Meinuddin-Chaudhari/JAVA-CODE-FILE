
public class Q2QuickSort {
	public static int partition(int ar[],int low,int high){
		int pivot=ar[high];
		int i=low-1;
		
		for(int j=low;j<high;j++){
			if(ar[j]<pivot){
				i++;
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		i++;
		int temp=ar[i];
		ar[i]=pivot;
		ar[high]=temp;
		return i;
	}
	public static void quick(int ar[],int low,int high){
		if(low<high){
			int pidx=partition(ar,low,high);
			quick(ar,low,pidx-1);
			quick(ar,pidx+1,high);
		}
	}
	public static void main(String[] args) {
		int [] ar= {30,5,65,20,1,90,80};
		int n=ar.length-1;
		
		quick(ar,0,n);
		for(int ele:ar)
		{
			System.out.println(ele);
		}
	}
}
