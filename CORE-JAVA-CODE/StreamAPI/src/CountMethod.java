

import java.util.*;
import java.util.stream.*;
public class CountMethod {
	public static void main(String[] args) {
	
			ArrayList<String> names = new ArrayList<String>();
			names.add("sachin");
			names.add("saurav");
			names.add("dhoni");
			names.add("yuvi");
			

			long count = names.stream().filter(name->name.length()>5).count();
			System.out.println(count);			
	}	
}