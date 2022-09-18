package allJavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class count_chars {

	public static void main(String[] args) {
		  
		String name="avinash mahadev pandhare";
		
		Map<Character,Integer> nameMap=new HashMap<>();
		
		char [] nameArray=name.toCharArray();
		
		int count=0;
		
		for(int i=0;i<nameArray.length;i++)
		{
			count=0;
			for(int j=0;j<nameArray.length;j++)
			{
				if(nameArray[i]==nameArray[j])
				{
					count++;
				}
				
			}
			
			nameMap.put(nameArray[i], count);
			
		}
		System.out.println(nameMap);
		
	}
}
