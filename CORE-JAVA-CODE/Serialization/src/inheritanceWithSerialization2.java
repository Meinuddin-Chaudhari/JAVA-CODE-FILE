import java.io.*;
class Animal13 
{
  int i=10;
   
}
class Dog4 extends Animal13 implements Serializable
{
  int j=50;
   
}

public class inheritanceWithSerialization2 
{
public static void main(String[] args)throws IOException,ClassNotFoundException
{
      Dog4 d4=new Dog4();
      d4.i=888;
      d4.j=999;
      
      System.out.println("Serialization started");
      
     FileOutputStream fos=new FileOutputStream("abc.ser");
     ObjectOutputStream oos=new ObjectOutputStream(fos);
     oos.writeObject(d4);
     
     System.out.println("Serialization ended");
     
     System.out.println("******************************");
     
     System.out.println("DeSerialization started");
     
     FileInputStream fis=new FileInputStream("abc.ser");
     ObjectInputStream ois=new ObjectInputStream(fis);
     Dog4 d5=(Dog4)ois.readObject();
   
     System.out.println(d5.i+"====> "+d5.j);
     System.out.println("DeSerialization ended");
 }
}