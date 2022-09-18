package allJavaPrograms;

public class sort_Array_Manually {

	public static void main(String[] args) {
		
		int myArray1[]= {22,98,66,19,8,42,56,5};
		int temp=0;
		for(int i=0;i<myArray1.length;i++)
		{
			for(int j=i+1;j<myArray1.length;j++)
			{
				if (myArray1[i]>myArray1[j])//22>19
			{
					temp=myArray1[i];//temp=22
					myArray1[i]=myArray1[j];//myArray1[i]=19
					myArray1[j]=temp;//myArray1[j]=0
			}
				
			}
			
		}
		for(int d=0;d<myArray1.length;d++)
		{
			System.out.println(myArray1[d]);
		}
		
	}

}
