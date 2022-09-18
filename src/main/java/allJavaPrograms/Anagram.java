package allJavaPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		   String a="brag";
	       String b="grab";
	       a=a.toLowerCase();
	       b=b.toLowerCase();
	       if(a.length()==b.length())
	       {
	    	   char[]arr1=a.toCharArray();
	    	   char[]arr2=b.toCharArray();
	    	   Arrays.sort(arr1);
	    	   Arrays.sort(arr2);
	    	   if(Arrays.equals(arr1, arr2))
	    	   {
	    		   System.out.println("The given strings are Anagram");
	    	   }
	    	   else
	    	   {
	    		   System.err.println("The given Strings are not Anagram1");
	    	   }
	    	   
	       }
	       else
    	   {
    		   System.err.println("The given Strings are not Anagram2");
    	   }

	}
}
