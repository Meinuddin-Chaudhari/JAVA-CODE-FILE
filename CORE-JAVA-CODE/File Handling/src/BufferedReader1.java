
import java.io.*;
class BufferedReader1 
{
public static void main(String[] args)throws IOException 
 {

	FileReader fr=new FileReader("aaa.txt");
	BufferedReader br=new BufferedReader(fr);
	
    String line= br.readLine();
    
    while(line!=null)
      {
       System.out.println(line);
       line=br.readLine();
      }
     br.close();
  }
}