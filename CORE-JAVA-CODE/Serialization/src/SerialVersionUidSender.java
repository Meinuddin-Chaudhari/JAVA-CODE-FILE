
import java.io.*;
 class Dog10 implements Serializable 
 {
 private static final long serialVersionUID=1L;
 int i=100;
 int j=200;
 }
 
public class SerialVersionUidSender
{
public static void main(String[] args)throws IOException 
  {
   Dog10 d=new Dog10();
   FileOutputStream fos=new FileOutputStream("abc.ser");
   ObjectOutputStream oos=new ObjectOutputStream(fos);
   oos.writeObject(d);
  }
}
