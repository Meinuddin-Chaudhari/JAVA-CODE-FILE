//
//import java.io.*;
//class Dog implements Serializable{
//	 
//	Cat c=new Cat();
//}
//class Cat implements Serializable{
//	Rat r=new Rat();
//	
//}
//class Rat implements Serializable{
//	int i=10;
//}
//
//public class GRAPHSERIALIZATION {
//	public static void main(String[] args)throws IOException,ClassNotFoundException{
//		
//		Dog d= new Dog();
//
//		System.out.println("Serialization Started");
//		
//		FileOutputStream fos= new FileOutputStream("abc.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(d);
//		System.out.println("Serialization ended");
//		
//		System.out.println("DeSerialization Started");
//		
//		FileInputStream fis= new FileInputStream("abc.ser");
//		ObjectInputStream ois=new ObjectInputStream(fis);
//		Dog d1=(Dog)ois.readObject();
//		System.out.println(d1.c.r.i);
//		
//		System.out.println("DeSerialization ended");		
//   }
//}