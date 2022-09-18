package testing;

public class constructor {
	
	public constructor() 
	{
		System.out.println("0 args cons...");
	}
		public constructor(int a) 
	{
		System.out.println("1 int args cons..."+ a);
	}
		public constructor(String b) 
	{
		System.out.println("1 string args cons..."+ b);
	}
		public void m1(String c) 
	{
		//System.out.println("M1 method"+c);
	}
		public void m2()
	{
		System.out.println("M2 method");
	}
		public void m3(int f) 
	{
		System.out.println("M3 method "+f);
	}
		public static void main(String[] args)
	{
			
			System.out.println("Here main method started");
		constructor obj = new constructor();
		
		
	

	
	}

}


