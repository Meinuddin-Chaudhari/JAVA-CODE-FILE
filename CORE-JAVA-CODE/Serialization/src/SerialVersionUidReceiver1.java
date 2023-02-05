
import java.io.*;
public class SerialVersionUidReceiver1 
{
public static void main(String[] args) throws IOException,ClassNotFoundException
{
  FileInputStream fis=new FileInputStream("abc.ser");
  ObjectInputStream ois=new ObjectInputStream(fis);
  
  Dog10 d2=(Dog10) ois.readObject();
  System.out.println(d2.i+"=====>"+d2.j);
 }
}