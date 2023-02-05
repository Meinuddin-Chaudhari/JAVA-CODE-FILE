
import java.util.*;
import java.util.stream.*;
public class collectMethod  {
	public static void main(String[] args) {
				
			ArrayList<String> names = new ArrayList<String>();
			names.add("sachin");
			names.add("saurav");
			names.add("dhoni");
			names.add("yuvi");
			
			List<String> result1=names.stream().filter(name->name.length()>5).
				collect(Collectors.toList());
			result1.forEach(System.out::println);
			

			List<String> result2 = names.stream().map(name-> name.toUpperCase()).
						collect(Collectors.toList());
			result2.forEach(System.out::println);
			
	}	
}
