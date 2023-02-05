
import java.io.*;

                                                                         
public class FileWriter1 {
	public static void main(String[] args)throws IOException {
		//to override the data
		File f=new File("hello.txt");
			FileWriter fw=new FileWriter(f);
			fw.write(73);
			
			fw.write("neuron\nTechnology\nPrivate\nLimited");
			fw.write("\n");
			
			char ch[] ={'a','b','c'};
			fw.write(ch);
			
			fw.flush();
			
			fw.close();
			
			
			
		//for appending the data to the file
//			FileWriter fw=new FileWriter("good.txt",true);
//			fw.write(73);
//			
//			fw.write("neuron\nTechnology\nPrivate\nLimited");
//			fw.write("\n");
//			
//			char ch[] ={'a','b','c'};
//			fw.write(ch);
//			
//			fw.flush();
//			
//			fw.close();
			
			
	}
}
