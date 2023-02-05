import java.util.*;
import java.util.function.*;

// public void forEach(java.util.function.Consumer<? super E>);
// public abstract void accept(T t)
class MyConsumer implements Consumer<String>
{
	@Override
	public void accept(String name){
		System.out.println(name);
	}
}
public class forEachInterface {
	public static void main(String[] args){

			ArrayList<String> names = new ArrayList<String>();
			names.add("sachin");
			names.add("dhoni");
			names.add("kohli");
			names.add("dravid");

			//Traditional approach
			Consumer<String> con = new MyConsumer();
			names.forEach(con);
			
			System.out.println("****************");
			
			//lambda expression
			names.forEach(n->System.out.println(n));
			
			System.out.println("****************");
			
			//method reference
			names.forEach(System.out::println);
	}
}