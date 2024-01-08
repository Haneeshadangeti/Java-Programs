import java.util.Scanner;

public class Control_Method_Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value");
		double num1=scan.nextDouble();
		System.out.println("enter a value2");
		double num2=scan.nextDouble();
		System.out.println("enter a operation");
		char operation=scan.next().charAt(0);
		scan.close();
		calculator(num1,num2,operation);
	}
	public static void calculator(double num1,double num2,char operation)
	{
		if(operation=='+')
		{
			System.out.println(num1+num2);
		}
		else if(operation=='-')
		{
			System.out.println(num1-num2);
		}
		else if(operation=='*')
		{
			System.out.println(num1*num2);
		}
		else if(operation=='/')
		{
			System.out.println(num1/num2);
		}
		else 
		{
			System.out.println("invalid input");
		}
		

	}

}
