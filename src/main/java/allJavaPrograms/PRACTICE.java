package allJavaPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class PRACTICE {

	public static void main(String[] args) {
		
		String name="avinash mahadev pandhare aaaaaaaaa";
		
		HashMap <Character ,Integer> hm=new HashMap <Character ,Integer>();
		
		char [] nameArray=name.toCharArray();
		Arrays.sort(nameArray);
		
		for(int i=0;i<name.length();i++)
			
		{
			int count=0;
			for(int j=0;j<name.length();j++)
			{
				if(nameArray[i]==nameArray[j])
				{
					count++;
				}
				hm.put(nameArray[i], count);
			}
			
		}
		System.out.println(hm);

	}

}
