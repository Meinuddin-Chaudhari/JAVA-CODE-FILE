import java.io.*;
class Account implements Serializable
{	
	String name="sachin";
	transient String password="tendulkar";

	private void writeObject(ObjectOutputStream oos)throws Exception
	{
		oos.defaultWriteObject();//performing default Serialization
		String epwd="123"+password;//performing encryption
		oos.writeObject(epwd);//w                                     rite the encrypted data to file(abc.ser)
	}
	private void readObject(ObjectInputStream ois)throws Exception
	{
		ois.defaultReadObject();//performing default Serialization
		String epwd=(String)ois.readObject();//performing decryption
		password=epwd.substring(3);//writing the extra data to Object
	}
}
public class CustomSerialization1  {
	public static void main(String[] args)throws IOException,ClassNotFoundException
	{		
		Account acc=new Account();

		System.out.println("Serialization Started");
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(acc);
		System.out.println("Serialization ended");

		System.out.println("***********************************");

		System.out.println("DeSerialization Started");
		FileInputStream fis= new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		acc=(Account)ois.readObject();
		System.out.println(acc.name +"=====> "+ acc.password);
		System.out.println("DeSerialization ended");					
   }
}
//same just like above program but in this two password is written

//class

//class Account implements Serializable
//{
//	String userName  = "sachin";
//	transient String password = "tendulkar";
//	transient int pin=4444;
//
//	 private void writeObject(ObjectOutputStream oos) throws Exception
//	 {
//		oos.defaultWriteObject();// perform default serialization
//		String encypwd  = "123"+password;// perform encryption on password
//		int encypin     = pin+1111;
//		
//		oos.writeObject(encypwd);//write the encrytped data as object to serialized file
//		oos.writeInt(encypin);	 
//	 }
//	 private void readObject(ObjectInputStream ois) throws Exception
//	 {
//		ois.defaultReadObject();//perform default deserialization
//		String encypwd = (String)ois.readObject();//read encrypted data from serialized file
//		int encypin    = ois.readInt();
//	
//		password = encypwd.substring(3);// perform decryption and attach it to instance variable
//		pin      = encypin - 1111;
//	 }
//}

//main method

//Account account =new Account();
//
//System.out.println("Serialization started.....");
//String fileName = "abc.ser";
//FileOutputStream fos   = new FileOutputStream(fileName);
//ObjectOutputStream oos = new ObjectOutputStream(fos);
//oos.writeObject(account);
//System.out.println("Serialization ended.....");
//
//System.out.println("****************************");
//
//System.out.println("De-Serialization started.....");
//FileInputStream fis   = new FileInputStream("abc.ser");
//ObjectInputStream ois = new ObjectInputStream(fis);
//Account acc=(Account)ois.readObject();
//			
//System.out.println("Username is :: "+acc.userName);
//System.out.println("Password is :: "+acc.password);
//System.out.println("Pin      is :: "+acc.pin);
//System.out.println("De-Serialization ended.....");	