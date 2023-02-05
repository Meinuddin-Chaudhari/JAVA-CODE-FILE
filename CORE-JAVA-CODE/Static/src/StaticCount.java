class demo3{
	int a;
	int b;
	static int count;
	{
		count++;
	}
	demo3(){
			
	}
	demo3(int a){
	this.a=a;	
	}
	demo3(int a, int b){
		this.a=a;
		this.b=b;
	}	
}
public class StaticCount {
	public static void main(String[] args) {
		demo3 d1=new demo3();
		demo3 d2=new demo3(10);
		demo3 d3=new demo3(20,30);
		System.out.println(demo3.count);
	}
}