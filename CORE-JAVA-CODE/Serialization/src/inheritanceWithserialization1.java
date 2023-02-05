import java.io.*;

class Animal12 implements Serializable
 {
    int i=10;
 }
class Dog1 extends Animal12
 {
   int j=30;
 }

public class inheritanceWithserialization1{
public static void main(String[] args)throws IOException,ClassNotFoundException
{
    Dog1 dc=new Dog1();
    
    System.out.println("Serialization started");
    
    FileOutputStream fos=new FileOutputStream("abc.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(dc);
    
    System.out.println("Serialization ended");
    
    System.out.println("******************************");
    
    System.out.println("DeSerialization started");
    
    FileInputStream fis=new FileInputStream("abc.ser");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Dog1 dd=(Dog1)ois.readObject();
    
    System.out.println(dd.i+"====> "+dd.j);
    
    System.out.println("DeSerialization ended");
 }
}