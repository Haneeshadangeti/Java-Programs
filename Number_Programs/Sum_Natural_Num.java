package Number_Programs;

public class Sum_Natural_Num {
	void display(int num)//creating a method with one parameter
	{
		int sum=0;//initializing the variable
		for(int i=1;i<=num;i++)//using for loop for n natural numbers
		{
			sum+=i;//calculating the sum of n natural numbers
			
		}
		System.out.println(sum);
	}

}
