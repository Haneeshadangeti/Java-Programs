package construtors_Methods;
import java.util.*;
public class Control_Method_Positive {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		s.close();
		positive(num);
		}
	public static void positive(int num)
	{
		if (num==0)
		{
			System.out.println("zero");
		}
		else if(num>0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("negetive number");
		}
	}
}



