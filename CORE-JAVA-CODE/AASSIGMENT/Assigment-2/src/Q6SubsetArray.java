public class Q6SubsetArray {
	static boolean Subset(int ar1[], int ar2[], int a, int b) {
		int j;
		int i;
		for (i = 0; i < b; i++) {
		         for ( j = 0; j < a; j++) {
		              if (ar2[i] == ar1[j]) {
		            	    break;
		                 }   
		              if ( j == a) {
			             return false; 
		                }
		         }          
		}
        return true;
}
	public static void main(String[] args) {
		int ar1[] = { 11, 1, 13, 21, 3, 7};
        int ar2[] = { 11, 3, 7, 1 };
 
        int a = ar1.length;
        int b = ar2.length;
 
        if (Subset(ar1, ar2, a, b))
            System.out.print("ar2 is subset of ar1 ");                      
        else
            System.out.print("ar2 is not a subset of ar1");                       
	}
}
