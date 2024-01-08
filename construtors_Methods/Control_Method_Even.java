package construtors_Methods;
import java.util.*;
public class Control_Method_Even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int num=s.nextInt();
		s.close();
		even(num);

	}
	public static void even(int num)
	{
	if (num%2==0)
	{
		System.out.println("even number");
	}
	else
	{
		System.out.println("odd number");
	}
}
}