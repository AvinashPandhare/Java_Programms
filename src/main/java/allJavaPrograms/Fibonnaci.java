package allJavaPrograms;

public class Fibonnaci {
	
	
    public static void main(String []args){
        int count =10;
        int n1=0;
        int n2=1;
        int n=0,i=0;
        System.out.print(n+" ");
        while(i<=count)
        {
            n=n1+n2;
            System.out.print(n+" ");
            n2=n1;
            n1=n;
            i++;
            
        }
        
      } 

}
