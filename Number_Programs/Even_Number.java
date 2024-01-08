package Number_Programs;

public class Even_Number {
	void display(int n)//creating a method with one parameter
	{
		System.out.println("Even numbers from 1 to "+n+" is:");
		for(int i=1;i<=n;i++)//using for loop to print n number
		{
			if(i%2==0)//checking the number is even
			{
				System.out.println(i);
			}
		}
	}

}



