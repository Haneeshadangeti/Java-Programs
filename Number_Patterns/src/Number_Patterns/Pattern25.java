package Number_Patterns;
import java.util.Scanner;
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		System.out.println("enter a number has to be printed");
		int k=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;i++)
			{
				System.out.print(k+" ");
				--k;
			}
			System.out.println();
		}
		scan.close();
	}

}
