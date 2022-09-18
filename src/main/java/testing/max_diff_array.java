package testing;

public class max_diff_array {

	public static void main(String[] args) {
		 
		int arr[]= {2,5,7,56,85};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]-arr[i]>max)
			{
				max=arr[j]-arr[i];
				
			}
		}
			
		}System.out.println(max);
	}

}
