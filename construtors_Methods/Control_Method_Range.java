package construtors_Methods;
import java.util.Scanner;

public class Control_Method_Range {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	s.close();
	Range(num);
	
	}
	public static void Range(int num)
	{
		if (num>=1&&num<=10)
		{
			System.out.println("range 1");
		}
		else if (num>=11&&num<=20)
		{
			System.out.println("range 2");
		}
		else if (num>=21&&num<=30)
		{
			System.out.println("range 3");
		}
		else if (num>=31&&num<=40)
		{
			System.out.println("range 4");
		}
		else if (num>=41&&num<=50)
		{
			System.out.println("range 5");
		}
		else
		{
			System.out.println("outside of the range");
		}
	}

}
