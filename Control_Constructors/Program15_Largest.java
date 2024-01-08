package Control_Constructors;


public class Program15_Largest {
	void display(int num1,int num2,int num3)//creating method with 3 parameters
	{
		if(num1==num2&&num2==num3)//checking the number is equal
		{
			System.out.println("equal");
		}
		else if(num1>num2&&num1>num3)//checking which number is largest
		{
			System.out.println("largest number:"+num1);
		}
		else if(num2>num3)
		{
			System.out.println("largest number:"+num2);
			
		}
		else
		{
			System.out.println("largest number : "+num3);
		}
	}

}
