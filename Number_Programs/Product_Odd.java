package Number_Programs;

public class Product_Odd {
void display(int n)//creating the method with one parameter
{ int count=0;
    int num=1;
    int product=1;
	//initializing the variable
	while(count<n)//using for for loop for n numbers
	{
		if(num%2!=0)//checking the number is even or odd
		{
		product=product*num;
			count++;//calculating the product of odd numbers			
	}
	num++;//increment the num value
	}
	System.out.println(product);
}
}

