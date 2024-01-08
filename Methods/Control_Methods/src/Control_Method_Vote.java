import java.util.Scanner;

public class Control_Method_Vote {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a age");
		int age=s.nextInt();
		s.close();
		vote(age);
	}
	public static void vote(int age)
	{
		if (age>=18)
		{
			System.out.println("eligible to vote");
			
		}
		else
		{
			System.out.println("not eligible to vote");
		}
	}

}
