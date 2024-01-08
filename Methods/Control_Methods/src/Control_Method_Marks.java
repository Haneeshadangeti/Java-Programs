import java.util.*;
public class Control_Method_Marks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int marks=s.nextInt();
		s.close();
		grades(marks);
		
	}
	public static void grades(int marks)
	{
		if(marks>90)
		{
		  System.out.println("grade A");
		}
		else
		{
			System.out.println("grade B");
		}
	}
		
	
}
