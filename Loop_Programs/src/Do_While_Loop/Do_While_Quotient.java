package Do_While_Loop;
import java.util.Scanner;

public class Do_While_Quotient {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
	
		do {
			num=num/2;
			System.out.println(num);
			
		}
		while(num>1);

	}

}
