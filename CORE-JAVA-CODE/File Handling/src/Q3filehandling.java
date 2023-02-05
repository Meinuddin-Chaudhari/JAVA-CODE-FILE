
//Requirement => Write a program to remove duplicates from the file
import java.io.*;
 class Q3filehandling
 {
     public static void main(String[] args)throws Exception
     {
       PrintWriter pw = new PrintWriter("output.txt");
       
      BufferedReader br = new BufferedReader(new FileReader("input.txt"));
         
      String target = br.readLine();
       while (target!=null)
       {
       boolean isAvailable =false;
       BufferedReader br1 =new BufferedReader(new FileReader("output.txt"));
       
       String line = br1.readLine();
      
      // break
       while (line!=null)
       {
       
        if (line.equals(target))
       {
       isAvailable = true;
       break;
       }
        line=br1.readLine();
      }
         if (isAvailable==false){
           pw.println(target);
           pw.flush();
       }
        target = br.readLine();
    }
      br.close();
       pw.close();
 }

}
