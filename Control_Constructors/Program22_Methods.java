package Control_Constructors;

public class Program22_Methods {
	void divisiblity2(int n)//creating a method 
	{
		
	System.out.print("divisible by 2 : ");
		for(int i=1;i<=n;i++)//loop for printing a n numbers
		{
			if(i%2==0)//checking the number divisible by 2 or not
			{
				
				System.out.print(" "+i);
			}
			
		}
		System.out.println();//to print next line
	}
	void divisibility3(int n)//creating a method
	{
		System.out.print("Divisible by 3: ");
		for(int i=1;i<=n;i++)//loop for printing n numbers
		{
			if(i%3==0)//checking the number is divisible by 3
			{
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}
	void divisiblity5(int n)//creating a method with onr parameter
	{
		System.out.print("Divisible by 5 :");
		for(int i=1;i<=n;i++)//loop for printing n numbers
		{
			if(i%5==0)//checking the number is divisible by 5
			{
				System.out.print(" "+i);//to print sameline
			}
		}
		System.out.println();//to print next line
	}
	void divisiblity_2and5(int n)//creating a method with one parameter
	{
		System.out.print("divisible by 2 and 5: ");
		for(int i=1;i<=n;i++)//loop for printing n numbers
		{
			if(i%2==0&&i%5==0)//checking the number is divisible by both 2 and 5
			{
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}
	void divisiblity_3and5(int n)//creating a method with one parameter
	{
		System.out.print("divisible by 3 and 5");
		for(int i=1;i<=n;i++)//loop for printing a n numbers
		{
			if(i%3==0&&i%5==0)//checking the number is divisible by 3 and 5
			{
				System.out.print(" "+i);
			}
		}
		System.out.println();//to print next line
	}
	
	void even_Divisible3(int n)//creating a method with one parameter
	{
		System.out.print("even numbers divisible by 3: ");
		for(int i=1;i<=n;i++)//loop for printing a n numbers
		{
			if(i%2==0&&i%3==0)//checking the number is even and divisible by 3
			{
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}
	void odd_Divisible5(int n)//creating a method with one parameter
	{
		System.out.print("odd numbers divisible by 5: ");
		for(int i=1;i<=n;i++)//loop for printing a n numbers
		{
			if(i%2!=0&&i%5==0)//checking the number is odd and divisible by 5
			{
				System.out.print(" "+i);
			}
		}
		System.out.println();//to print next line
	}
	void prime(int n)//creating a method with one parameter
	{
		System.out.print("prime numbers :");
		for(int i=1;i<=n;i++)//loop for printing n numbers
		{
			int count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(" "+i);
			}				
		}
		System.out.println();		
	}
	void even_Prime(int n)//creating a method with one parameter
	{
		System.out.print("even numbers which are prime: ");
		for(int i=1;i<=n;i++)//loop for printing n numbers
		{ int count=0;
		for(int j=2;j<=i;j++)
		{
			if(i%j==0&&i%2==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.print(" "+i);
		}
		} 
		System.out.println();//to print next line
	}
	void odd_prime(int n)//creating a method with one parameter
	{
		System.out.print("odd numbers which are prime: ");
		for(int i=1;i<=n;i++)//loop for printing n numbers
		{ int count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0&&i%2!=0)
				{
					count++;
				}
			}
			if(count==1)//checking the number is odd and prime number
			{
				System.out.print(" "+i);
			}
		}
		System.out.println();//to print next line
	}
}
			
		
	


