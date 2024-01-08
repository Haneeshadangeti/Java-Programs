package Do_While_Loop;
import java.util.Scanner;

public class Do_While_Factorial {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	int fact=1;
	int i=1;
	do {
		fact=fact*i;
				i++;
		
	}while(i<=num);
	System.out.println(fact);

	}

}
