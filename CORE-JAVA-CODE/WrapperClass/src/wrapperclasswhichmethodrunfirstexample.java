
class  wrapperclasswhichmethodrunfirstexample

{ 
	public static void methodOne(int o) { //(1)normal method match
	System.out.println("int"); 
		}
	public static void methodOne(long o) { //(2)widening
			System.out.println("long"); 
		}
	public static void methodOne(Integer o) { //(3)autoboxing
			System.out.println("integer"); 
		}
	public static void methodOne(Object o) { //(4)widening followed by autoboxing
			System.out.println("Object"); 
		} 
		
	public static void methodOne(int...o) { //(5)var args
		System.out.println("var arg"); 
	} 
	
	
	public static void main(String[] args) { 
		int x=10; 
		 methodOne(x); 
	} 
} 