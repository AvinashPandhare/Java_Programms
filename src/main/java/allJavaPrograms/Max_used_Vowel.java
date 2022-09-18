package allJavaPrograms;

public class Max_used_Vowel {

	public static void main(String[] args) {
		
		String str="My Name is Avinash";
		str=str.toLowerCase();
		int a = 0,e=0,i=0,o=0,u=0;
		
		
		for(int z=0;z<str.length();z++)
		{
			 if(str.charAt(z)=='a')
			{
				a++;
			}
			
			else if(str.charAt(z)=='e')
			{
				e++;
			}
			
			else if(str.charAt(z)=='i')
			{
				i++;
			}
			
			else  if(str.charAt(z)=='o')
			{
				o++;
			}
			
			else if(str.charAt(z)=='u')
			{
				u++;
			}
	
		}
		
		System.out.println(a+" "+e+" "+i+" "+o+" "+u);
		
		if(a>e && a>i && a>o && a>u)
		{
			System.out.println(a);
		}
		else if( e>i && e>o && e>u)
		{
			System.out.println(e);
		}
		
		else if(i>o && i>u)
		{
			System.out.println(i);
		}
		
		else if(o>u)
		{
			System.out.println(o);
		}
		
		else 
		{
			System.out.println(u);
		}
				

	}

}
