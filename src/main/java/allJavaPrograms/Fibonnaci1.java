package allJavaPrograms;

public class Fibonnaci1 {

	public static void main(String[] args) {
		int count=5;
		int n1=0,n2=1,n=0,i=0;
		while(i<=count)
		 {
			 n=n1+n2;
			 System.out.println(n);
			 System.out.println("Value of n2 before="+n2);
			 n2=n1;
			 System.out.println("Value of n2 after="+n2);
			 
			 System.out.println("Value of n1 before="+n1);
			 n1=n;
			 
			 System.out.println("Value of n1 after="+n1);
			 i++;
		 }
				

	}

}
