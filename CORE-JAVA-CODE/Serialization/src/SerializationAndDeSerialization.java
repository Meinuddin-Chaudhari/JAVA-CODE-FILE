import java.io.*;
class Dog implements Serializable
{	
	Dog(){
		System.out.println("Object is created...");
	}

	 //transient int i = 10;  not participate
	 //static transient int j = 20;     participate
	//final transient int j=20;         paricipate
	 int i = 10;
	int j = 20;
	 
		
}

class SerializationAndDeSerialization
{
	public static void main(String[] args)throws Exception 
	{
			Dog d = new Dog();

			System.out.println("Serialization started.....");
			
			String fileName = "abc.ser";
			FileOutputStream fos   = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			
			System.out.println("Serialization ended.....");

			//To pause the execution till we press some key from keyboard
			System.in.read();

			System.out.println("De-Serialization started.....");
			
			FileInputStream fis   = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj=ois.readObject();
			Dog d1 = (Dog)obj;
				
			System.out.println(d1.i+"----"+d1.j);
			System.out.println("De-Serialization ended.....");
	
	}	//JVM shutdown now
}