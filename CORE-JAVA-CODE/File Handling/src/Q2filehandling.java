
//Requirement => file1.txt file2.txt copy one line from file1.txt and from file2.txt
//to file3.txt.
import java.io.*;
class Q2filehandling 
{
    public static void main(String[] args)throws Exception
   {
     PrintWriter pw = new PrintWriter("file3.txt");
     //reading from first file and writing to file3.txt
     
     BufferedReader br1= new BufferedReader(new FileReader("file1.txt"));
     String line1 = br1.readLine();
     
     BufferedReader br2 =new BufferedReader(new FileReader("file2.txt"));
     String line2 = br2.readLine();
       while (line1!=null || line2!=null)
       {
           if (line1!=null)
           {
            pw.println(line1);
            line1=br1.readLine();
            }
           if(line2!=null)
           {
           pw.println(line2);
           line2=br2.readLine();
            }
       }
         //To write all the data to file3.txt
         pw.flush();
         br1.close();
         br2.close();
         pw.close();
         
  }

}