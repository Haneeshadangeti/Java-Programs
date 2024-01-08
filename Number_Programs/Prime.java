package Number_Programs;

public class Prime {
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
			if(count==1)//checking the count
			{
				System.out.print(" "+i);
			}				
		}
		System.out.println();		
	}
	
}
