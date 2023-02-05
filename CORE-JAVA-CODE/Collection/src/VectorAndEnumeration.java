import java.util.Enumeration;
import java.util.Vector;

public class VectorAndEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		Enumeration em=v.elements();
		while(em.hasMoreElements())
		{
			Integer it=(Integer) em.nextElement();
			
			System.out.println(it);
		}
	}

}
