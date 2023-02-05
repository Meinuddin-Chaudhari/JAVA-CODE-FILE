

import java.util.*;
import java.util.stream.*;

public class forEachMethod{
	public static void main(String[] args) {
				
			ArrayList<String>names = new ArrayList<String>();
			names.add("AAA");
			names.add("BBB");
			names.add("CCC");
			

			names.stream().forEach(name -> System.out.println(name));
			names.stream().forEach(System.out::println);
		
}	

}