

class Plane1
{
	public void fly()
	{
		System.out.println("Plane is flying");
	}
}
class CargoPlane1 extends Plane1
{
	 public void fly()
		{
			System.out.println("CargoPlane is flying");
		}
	 public void eat()
	 {
		 System.out.println("eating in cargoplane");
	 }
}
class PassengerPlane1 extends Plane1
{
	 public void fly()
		{
			System.out.println("PassengerPlane is flying");
		}
}
public class PolymorphismSpecializedMethod {
	public static void main (String []args)
	{
		Plane1 cp =new CargoPlane1();

		cp.fly();
		((CargoPlane1) cp).eat();//downcasting
		
	}

}
