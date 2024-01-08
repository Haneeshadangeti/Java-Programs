package Number_Programs;

public class Largest_Digits {
	void display(int num)//creating a method with on parameter
	{   int rem=0;//initializing the variable
	    int max=0;//Initializing the variable for storing a maximum value
	    while(num!=0)//using while loop
		{
			 rem=num%10;//calculating the digits
			 if(max<rem)//comparing the values
			 {
				 max=rem;
			 }
			num=num/10;//updating the n value
			
		}
		System.out.println(max+" is a largest number");//printing a message
		
		
	}

}
