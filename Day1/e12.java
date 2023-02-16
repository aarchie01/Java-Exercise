import java.util.*;
import java.util.Scanner;
class e12
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value:");
		int n=s.nextInt();
		//for(int n=0;n>0;n++)
		if (n<0)
		{
			System.out.println("Number is too small");
			
		}
		else if (n>32767)
		{
			System.out.println("number is too large");
		}
		else{
			while(n%2==0){
				n=n/2;
		}
			if(n==1){
				System.out.println("number is power of 2");
		}
		else{
			System.out.println("number is not a power of 2");
		}
		}
		
	}
}