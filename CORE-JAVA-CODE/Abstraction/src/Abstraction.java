 abstract class Plane
{
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	abstract public void eat();
	
}
class CargoPlane extends Plane
{
	 public void fly()
		{
			System.out.println("CargoPlane is flying");
		}
	  public void eat()
	 {
			  
	  System.out.println(" eating in CargoPlane");
	 }
}
class PassengerPlane extends Plane
{
	 public void fly()
		{
			System.out.println("PassengerPlane is flying");
		}
	 public void eat()
	 {
		 System.out.println(" eating in passengerPlane"); 
	 }
}
public class Abstraction {
	public static void main (String []args)
	{
		CargoPlane cp =new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		
		Plane aero; //parent reference type and variable
		aero=cp;
		aero.fly();
		aero.eat();
		aero=pp;
		aero.fly();
		aero.eat();
		
		
	}

}
