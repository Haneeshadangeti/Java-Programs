package Calculator;
import java.util.*;
public class Calculator2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a first number");
		int a=scan.nextInt();
		System.out.println("enter a second number");
		int b =scan.nextInt();
		System.out.println("the addition of"+a+"and"+b+"is "+add(a,b));
		System.out.println("the subtraction of"+a+"and"+b+"is "+sub(a,b));
		System.out.println("the multiplication of"+a+"and"+b+"is "+mul(a,b));
		System.out.println("the division of"+a+"and"+b+"is "+div(a,b));
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}

}
