package Number_Patterns;
import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//printing the numbers
			{
				System.out.print(j);
			}
			System.out.println();
		}
		scan.close();
	}

}
