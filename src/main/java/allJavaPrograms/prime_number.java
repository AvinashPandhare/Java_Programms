package allJavaPrograms;

public class prime_number {

	public static void main(String[] args) {
		for (int i=0;i<=100;i++)
		{
			int temp=0;
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					temp=1;
				}
			}
			if(temp==0)
			{
			System.out.println(i+" is an Prime Number");
			}
			
		}

	}

}
