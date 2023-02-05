 class Plane
 {
	public void fly()
	{
		System.out.println("Plane is flying");
	}
 }
 class CargoPlane extends Plane
 {
	 public void fly()
		{
			System.out.println("CargoPlane is flying");
		}
 }
 class PassengerPlane extends Plane
 {
	 public void fly()
		{
			System.out.println("PassengerPlane is flying");
		}
 }
public class Polymorphism1 {
	public static void main (String []args)
	{
		CargoPlane cp =new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		
		Plane aero; //parent reference type and variable
		aero=cp;
		aero.fly();
		aero=pp;
		aero.fly();
		
		
	}

}
