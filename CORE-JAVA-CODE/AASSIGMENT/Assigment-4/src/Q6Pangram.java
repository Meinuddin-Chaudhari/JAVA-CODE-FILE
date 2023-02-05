public class Q6Pangram {

	public static void main(String[] args) {
		String s1="THE QUICK BROWN FOX JUMP OVER THE LAZY DOGS";
		
		  s1=s1.replace(" ","");
		  char [] ch=s1.toCharArray();
		  int [] ar =new int [26];
		  boolean flag=false;
		  
		  for(int i=0;i<ch.length;i++)
		  {
			  int index= ch[i]-65;
			  ar[index]++;
		  }
		  
		  for(int i=0;i<ar.length;i++)
		  {
			  if(ar[i]==0)
			  {
				System.out.println("not pangram"); 
				flag=true;
				break;
			  }
		  }
		  if(flag==false)
		  {
			  System.out.println(" pangram");   
		  }
	}
}
