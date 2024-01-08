package Number_Patterns;
import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(k%2==0&&k<10)
				{
					System.out.print("0"+k+" ");
				}
				else if(k%2!=0&&k<10)
				{
					System.out.print("0"+k+" ");
				}
				else
				{
					System.out.print(k);
				}
				k++;
				
			}
			System.out.println();
		}
		scan.close();
	}
}
