package allJavaPrograms;

public class Palindrom {

	public static void main(String[] args) {
		
		String a="MadaM";
		String b="";
		for (int i=a.length()-1;i>=0;i--)
		{
			b=(b+a.charAt(i));
		}
		if(a.equals(b))
		{
			System.out.println("Word is Palindromm");
		}
		else
		{
			System.err.println("Word is No Palindromm");
		}
	}

}
