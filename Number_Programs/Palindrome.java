package Number_Programs;

public class Palindrome {
	void display(int n)//creating a method with one parameter
	{   
		
		int temp=n;//storing a n value in a temporary variable
		int revnum=0;//initializing the variable
		while(n!=0)//using while loop
		{	
			int res=n%10;//calculating the digits of the number
			revnum=revnum*10+res;//storing into a revnum variable
			n=n/10;	//updating a value
		}
		if(revnum==temp)//checking the given number and reverse number is equal or not 
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+" is not a palindorme");
		}
	}

}
