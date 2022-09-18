package allJavaPrograms;

public class ReverseStringAtSamePosition {
	
	public static void main(String[] args) {
	String a="Hello World This Is Me";
	
	String b[]=a.split(" ");
	
	System.out.println(b.length);
	
//	System.out.print(b[0]);
//	System.out.print(" ");
//	System.out.print(b[1]);
//	System.out.print(" ");
//	System.out.print(b[2]);
//	System.out.print(" ");
//	System.out.print(b[3]);
//	System.out.print(" ");
//	System.out.print(b[4]);
//	System.out.println(" ");
//	System.out.println("----------------------------------------------------");
//	
//	
//	for(int x=b[0].length()-1;x>=0;x--)
//	{
//		System.out.print(b[0].charAt(x));
//	}
//	System.out.print(" ");
//	for(int x=b[1].length()-1;x>=0;x--)
//	{
//	System.out.print(b[1].charAt(x));
//	}
//	System.out.print(" ");
//	for(int x=b[2].length()-1;x>=0;x--)
//	{
//		System.out.print(b[2].charAt(x));
//	}
	
	System.out.print(b[0]+" "+b[1]+" "+b[2]+" ");
	
	//System.out.print(" ");
	for(int x=b[3].length()-1;x>=0;x--)
	{
		System.out.print(b[3].charAt(x));
	}
	
	System.out.print(" "+b[4]);
//	System.out.print(" ");
//	for(int x=b[4].length()-1;x>=0;x--)
//	{
//		System.out.print(b[4].charAt(x));
//	}

}
}
