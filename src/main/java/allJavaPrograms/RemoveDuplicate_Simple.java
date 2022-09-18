package allJavaPrograms;

import java.util.Arrays;

public class RemoveDuplicate_Simple {

	  
	public static void main(String[] args)
    {   
		String str = "avinash mahadev pandhare";
       
        String newstr = new String();   
        
        
          
        for (int i = 0; i < str.length(); i++)    
        {   
          
            char charAtPosition = str.charAt(i);   
                                           
            if (newstr.indexOf(charAtPosition) < 0) 
            	
            {   
            	
            	newstr =newstr + charAtPosition;    
            }   
        } 
        System.out.println(newstr);  
    }   
 
}
