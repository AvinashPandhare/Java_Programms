package allJavaPrograms;

import java.util.Arrays;

public class arrayCheck {

	public static void main(String[] args) {
		
		
		String [] array1= {"avinash","lallu","shima","seema"};
		
		for(String w:array1)
		{
			System.out.print(w+"===");
		}
		
        Arrays.sort(array1);
        for(String t:array1)
		{
			System.out.print(t+"===");
		}
      

	}

}
