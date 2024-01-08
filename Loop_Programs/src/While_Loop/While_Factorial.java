package While_Loop;
import java.util.Scanner;

public class While_Factorial {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scan.nextInt();
	int fact=1;
	int i=1;
	while(i<=num)
	{
		fact*=i;
		System.out.println(fact);
		i++;
	}

	}

}
