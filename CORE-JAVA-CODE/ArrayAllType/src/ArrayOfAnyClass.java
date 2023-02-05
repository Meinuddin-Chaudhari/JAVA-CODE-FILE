
class Fan
{
	int cost;
	String brand;
	int noOfWing;
}

public class ArrayOfAnyClass {

	public static void main(String[] args) {
		
		Fan[] f =new Fan[3];
		
		f[0]=new Fan();
		f[1]=new Fan();
		f[2]=new Fan();
				

		f[0].brand="sky";
		f[0].cost=1000;
	}

}
