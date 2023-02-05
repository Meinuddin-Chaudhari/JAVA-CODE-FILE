
public class StringImmutable {

	public static void main(String[] args) {
		// for update
		//string
    String s1="sachin";
   s1.concat("tendulkar");
    System.out.println(s1);//sachin

    //StringBuilder
    StringBuilder s2=new StringBuilder("sachin");
    s2.append("tendulkar");
     System.out.println(s2);
     
     
     
     
     //for compare
     //String
     String s3="sachin";
     String s4=new String("sachin");
      System.out.println(s3==s4);//false because operator compare within the object
      //here two object created
      
      String s5="sachin";
      String s6=new String("sachin");
       System.out.println(s5.equals(s6));//true because equals() compare  the content
       //between two object
       
       //StringBuilder
       StringBuilder s7=new StringBuilder("sachin");
       StringBuilder s8=new StringBuilder("sachin");
       System.out.println(s7.equals(s8));//false because equals() compare  the refrence
       //between two object
	}

}
