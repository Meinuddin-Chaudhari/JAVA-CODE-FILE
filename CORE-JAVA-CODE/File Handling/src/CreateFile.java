
import java.io.*;

class CreateFile{
	public static void main(String[] args)throws IOException{

		File f=new File("abc.txt");
		System.out.println(f.exists());//false

		f.createNewFile();
		System.out.println(f.exists());//true
	}
}