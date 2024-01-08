package While_Loop;
import java.util.Scanner;

public class While_Quotient {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		
		while(num>1)
		{
			num=num/2;
			System.out.println(num);
			
		}


	}

}
