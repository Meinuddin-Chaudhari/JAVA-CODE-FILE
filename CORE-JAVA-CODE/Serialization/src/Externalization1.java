import java.io.*;
class ExternalizableDemo implements Externalizable
{                                                                                                                                                               
    String i;
       int j;
       int k;
       public ExternalizableDemo()
       {
     	  System.out.println("Zero arg constructor");
       }
      ExternalizableDemo(String i,int j,int k)
      {
      this.i=i;
      this.j=j;
      this.k=k;
      }   
     public void writeExternal(ObjectOutput out) throws IOException
     {
      out.writeObject(i);
      out.writeInt(j);
     }
      public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
      {
       i=(String)in.readObject();
       j=in.readInt();
      }
}
public class Externalization1{
    public static void main(String[] args)throws IOException,ClassNotFoundException
    {
     ExternalizableDemo d=new ExternalizableDemo("nitin",100,200);
     
     System.out.println("Serialization started");
     
     FileOutputStream fos=new FileOutputStream("abc.ser");
     ObjectOutputStream oos=new ObjectOutputStream(fos);
     oos.writeObject(d);
     
     System.out.println("Serialization ended");
     
     System.out.println("******************************");
     
     System.out.println("DeSerialization started");
     
     FileInputStream fis=new FileInputStream("abc.ser");
     ObjectInputStream ois=new ObjectInputStream(fis);
     ExternalizableDemo d1=(ExternalizableDemo)ois.readObject();
     System.out.println(d1.i+"======>"+d1.j+"======>"+d1.k);
     
     System.out.println("DeSerialization ended");
    }
}