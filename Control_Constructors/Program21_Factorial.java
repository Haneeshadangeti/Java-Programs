package Control_Constructors;

public class Program21_Factorial {
	void display(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial of number is :"+fact);
	}

}
