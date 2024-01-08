package Number_Programs;

public class Fibonacci{
void display(int num,int num1,int num2)
{
	int temp;//Initialing a variable
	if(num==0)//using if condition 
	{
		System.out.println(num1+" ");
	}
	else if(num==1)
	{
		System.out.println(num2+" ");
	}
	else
	{
		System.out.print(num1+" "+num2+" ");
	}
	for(int i=1;i<=num;i++)
	{
		temp=num1+num2;//adding two numbers
		System.out.print(temp+" ");
		num1=num2;
		num2=temp;
	}
}
}
