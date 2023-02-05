
public class Q4MergeSort {

	public static void divide(int ar[],int lb,int ub){
		if(lb<ub){
		
			
			int mid=(lb+ub)/2;
			    divide(ar,lb,mid);
			    divide(ar,mid+1,ub);
			    merge(ar,lb,mid,ub);	
	}
	}
	public static void merge(int ar[],int lb,int mid, int ub){
		int i=lb;
		int j=mid+1;
		int [] b=new int[ub-lb+1];
		int k=0;
		
		while(i<=mid && j<=ub){
			if(ar[i]<=ar[j]) {
				b[k]=ar[i];
				i++;k++;
				
			}
			else {
				b[k]=ar[j];
				j++;k++;
				
			    }
		}
		while(i<=mid){
			b[k]=ar[i];
			i++;
			k++;	
		    }
		while(j<=ub){
			b[k]=ar[j];
			j++;
			k++;	
		    }
		for(i=0,j=lb;i<b.length;i++,j++) {
			ar[j]=b[i];
		    }	
	}
	public static void main(String[] args) {
		int [] ar = {34,12,90,19,5,88};
		int n=ar.length-1;
	   divide( ar,0,n);
	 for(int ele:ar)
	 {
		 System.out.println(ele);
	 }
	}
}
