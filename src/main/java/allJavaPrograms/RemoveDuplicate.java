package allJavaPrograms;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
        String a="ABB CDD EFF GHH";
		int i=1;
		int j=1;
		char temp[]=a.toCharArray();
		Arrays.sort(temp);
		a= new String(temp);
		System.out.println(a);
		char arr[]=a.toCharArray();
		
		System.out.println(arr.length);
		
		while(i != arr.length)
		{
			if(arr[i] != arr[i-1])
			{
				arr[j]=arr[i];
				j++;
			}
			i++;
			
		}
		a=new String(arr); 
		//System.out.println("new string= "+a);
	  System.out.println(a.substring(0, j));
    }   

	

}
