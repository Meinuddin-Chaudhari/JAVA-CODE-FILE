
import java.io.*;


public class FileReader1 {
	public static void main(String[] args)throws IOException 
	{
//			FileReader fr=new FileReader("hello.txt");
//			                     int i=fr.read();
//		
//			while(i!=-1){
//				
//				System.out.print((char)i);
//				i=fr.read();
//			}
			
			
			
			
		      File f=new File("abcde.txt");

			FileReader fr=new FileReader(f);
			char ch[] = new char[(int)f.length()];
			
		     fr.read(ch);
			
			String data=new String(ch);
			System.out.println(data);
			fr.close();
	}
	
	
}