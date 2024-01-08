package Number_Programs;

public class Sum_Squares_n {
void display(int num)//creating a method with one parameter
{	int sum=0;//Initialing a variable
	for(int i=1;i<=num;i++)//using for loop for n numbers
	{	
		sum+=i*i;//calculating the sum of squares of natural numbers
	}
      System.out.println(sum);
}
}
