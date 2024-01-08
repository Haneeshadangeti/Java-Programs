package Number_Programs;

public class Factorial {
	void display(int num)//creating a method with one parameter
	{
		int fact=1;//initializing a variable
		for(int i=1;i<=num;i++)//using for loop for n numbers
		{
			fact=fact*i;//calculating a factorial of a number
			
		}
		System.out.println(fact);
	}

}
