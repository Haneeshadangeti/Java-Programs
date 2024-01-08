package construtors_Methods;
import java.util.Scanner;

public class Control_Method_Sub {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num1");
		int num1=scan.nextInt();
		System.out.println("enter a num2");
		int num2=scan.nextInt();
		sub(num1,num2);
	}
		public static void sub(int num1,int num2)
		{
		if(num1>num2)
		{
			System.out.println(num1-num2);
			
		}
		else
		{
			System.out.println(num2-num1);
		}


	}

}
