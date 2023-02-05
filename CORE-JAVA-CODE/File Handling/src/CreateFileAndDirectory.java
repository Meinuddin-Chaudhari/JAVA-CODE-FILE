
import java.io.*;
class CreateFileAndDirectory
{
	
  public static void main(String[] args)throws IOException
  {
  File f1=new File("IPLTeam");
	f1.mkdir();
	
	File f2=new File("IPLTeam","abc.txt");
	f2.createNewFile();
	
//	File f=new File("c:\\IPLTeam","rcb.txt");
//	f.createNewFile();
  }
}

