import java.util.*;
class e11
{
	public static void main(String[]args)
	{
		System.out.println(" Welcome to if statements");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of salary");
		//System.out.println("Enter number of shifts");
		int k=s.nextInt();
		if (k>8000)
		{
			System.out.println("Salary is too large");
		}
		else
		{
			System.out.println("Salary is :"+k);
			System.out.println("Total expenditure:" +(k*0.5));
		}
		System.out.println("Enter number of shifts");
		int k1=s.nextInt();
		System.out.println("number of shifts are:"+k1);
		System.out.println("salary per day after taking care of her shifts:"+(k1*0.02));
		System.out.println(" salary after spending all of these : "+((k*0.5)+(k1*0.02)));
		
		
	}
}
