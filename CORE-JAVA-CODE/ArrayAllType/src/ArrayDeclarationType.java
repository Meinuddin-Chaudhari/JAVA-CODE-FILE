// All Type Array Declaration Type....
public class ArrayDeclarationType {

	public static void main(String[] args) {
		//Array Declaration
		int []aa;
		int bb[];
		int []   cc;
		  cc=new int[4];
		  
		  //2D
		  int[][]  dd;
		  int  ee[][];
		  int  [][]ff;
		  
		  int [] gg,hh;
		    gg=new int [4];
		    
		    int []jj[],kk;	//jj==2D  kk==1D
		    int [][]LL,MM;
		    
		    int [][] nn[],o; //nn==3D  o==2D
		    int [][]pp,q[];  //
		    
	//	    int[]rr, []ss;    //after comma(,) variable should be there
		   
			
		// 1-D Array Declaration 
		int []a = {10,20,30};
		int []b = new int [] {10,20,30};
        int []c = new int [3];
        
        
        //2-D Regular Array Declaration
        int [][]d ={ {10,20,30} ,{10,20,30}};
		int [][]e = new int [][] { {10,20,30} ,{10,20,30}};
        int [][]f = new int [3][2];
        
        
        //2-D jagged Array declaration
        int [][]k = new int [2][];
              k[0]=new int [3];
              k[1]=new int [2];
              k[2]=new int [3];
        
       
        //3-D Regular Array Declaration
        int [][][]g ={{{10,20,30} ,{10,20,30},{10,20,30}}};
		int [][][]h = new int [][][] {{{10,20,30} ,{10,20,30},{10,20,30}}};
        int [][][]i = new int [3][2][3];
        
        
        //3-D jagged array Delaration
        int [][][] m=new int [2][][];
        m[0] = new int[2][];
        m[1] = new int[1][];
        m[2] = new int[2][];
        
        m[0][0]=new int[2];
        m[0][1]=new int[4];
        m[0][2]=new int[3]; 
        
        m[1][0]=new int[2];
        m[1][1]=new int[4];
       
        m[2][0]=new int[2];
        m[2][1]=new int[4];
        m[2][2]=new int[4];
       
	}

}
