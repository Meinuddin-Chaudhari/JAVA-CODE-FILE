class aeroplane
 {
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	 public void land()
		{
			System.out.println("Plane is landing");
		}
 }
class cargoPlanee extends aeroplane
{
	 public void fly()
		{
			System.out.println("CargoPlane is flying");
		}
	 public void land()
		{
			System.out.println("cargoPlane is landing");
		}
	
 }
  class passengerPlanee extends aeroplane
 {
	 public void fly()
		{
			System.out.println("PassengerPlane is flying");
		}
	 public void land()
		{
			System.out.println("passengerPlane is landing");
		}
 }
  class Airport
  {
	  public void permit(aeroplane ap)
	  {
		  ap.fly();
		  ap.land();
	  }
  }
public class Polymorphism2 {
	public static void main (String []args)
	{
		cargoPlanee cp =new cargoPlanee();
		passengerPlanee pp=new passengerPlanee();
		
	    Airport a=new Airport();
	    a.permit(cp);
	    a.permit(pp);
	    
	}
}
