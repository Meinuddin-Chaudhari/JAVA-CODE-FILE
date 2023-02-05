import java.io.*;
class PrintWriter1
{
public static void main(String[] args)throws Exception
 {
       FileWriter fw = new FileWriter("bbb.txt");
       PrintWriter t = new PrintWriter(fw);
       
       t.write(100);//100 un icode value will be written to a file
       t.write('\n');
       
       t.println(100);//100 only will be written to the file
       t.println(true);
       t.println('c');
       
       t.println("DenisRitchie");
       t.flush();
       t.close();
  }
}