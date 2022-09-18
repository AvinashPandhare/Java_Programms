package allJavaPrograms;

public class Armstrong_Number {

	public static void main(String[] args) {
		int number=153;
		int temp=number;
		int result=0;
		int reminder;
		
		while(number>0)
		{
			reminder=number%10;
			result=result+(reminder*reminder*reminder);
			number=number/10;		
		}
		if(temp==result)
		{
			System.out.println("Yes its Armstrong");
		}
		else
		{
			System.out.println("No its not");
		}

	}

}
