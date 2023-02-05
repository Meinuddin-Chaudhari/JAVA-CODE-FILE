package methodHiding;

//method hiding
class vehicle
{
	public static void Seat()
	{
		System.out.println("i am in vehicle");
	}
}
class car extends vehicle
{
	public static void Seat()
	{
		System.out.println("i am in car");
	}
}
public class methodhiding {
	public static void main(String[] args) {
		
		vehicle c=new car();
		c.Seat();
	}

}
