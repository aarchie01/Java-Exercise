//array ex02 (01)
import java.util.*;
class e21
{
	public static void main(String[] args)

	{
		
		   
	    Scanner s=new Scanner (System.in);
		System.out.println("Enter the size of an array:");
		int n=s.nextInt();
		int []a = new int[n];
		int sum_even=0;
		int sum_odd=0;
		
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		    if(a[i]%2==0)
		     {
			sum_even=sum_even+a[i];
			
		     }
		    else{
			sum_odd=sum_odd+a[i];
			
		     }
		}
	if(sum_odd>sum_even)
	{
		System.out.println(sum_odd);
		
	}
	else{
		System.out.println(sum_even);
		
	}
}
}