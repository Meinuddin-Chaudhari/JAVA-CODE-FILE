class  wideningVSautoboxing

{ 
	public static void methodOne(int o) { 
		System.out.println("int"); 
		}
	public static void methodOne(long o) { 
			System.out.println("long"); 
		}
	public static void methodOne(Integer o) { 
			System.out.println("integer"); 
		}
	public static void methodOne(Object o) { 
			System.out.println("Object"); 
		} 
		
	public static void methodOne(int...o) { 
		System.out.println("var arg"); 
	} 
	
	
	public static void main(String[] args) { 
		int x=10; 
		 methodOne(x); 
	} 
} 
