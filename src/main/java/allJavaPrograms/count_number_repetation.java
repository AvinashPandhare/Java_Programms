package allJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class count_number_repetation {

	public static void main(String[] args) {
		//String name="avinash mahadev pandhare";
		int [] nums= {1,2,3,4,5,1,2,5,4,7,9,5,5,5};
		HashMap<Integer,Integer> nameMap=new HashMap<>();
	
		int count=0;

		for(int i=0;i<nums.length;i++)
		{
			count=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
				}
				
			}
			
			nameMap.put(nums[i], count);
			
		}
		System.out.println(nameMap);
		
	}

	

}
