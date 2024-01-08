import java.util.Scanner;

public class Control_Method_Div {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num1");
		int num1=scan.nextInt();
		System.out.println("enter a num2");
		int num2=scan.nextInt();
		scan.close();
		div(num1,num2);
	}
		public static void div(int num1,int num2)
		{
		if (num2==0)
		{
			System.out.println("Invalid division");
		}
		else
		{
			System.out.println(num1/num2);

		}
	}

}
