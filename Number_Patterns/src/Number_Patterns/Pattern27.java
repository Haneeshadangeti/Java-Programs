package Number_Patterns;
import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
		int k=1;//intializing the variable
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(k<10)
				{
					System.out.print("0"+k+" ");
				}
				else
				{
					System.out.print(k+" ");
				}
				k++;
			}
			System.out.println();
		}
		scan.close();
	}

}
