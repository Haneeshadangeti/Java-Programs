package Number_Patterns;
import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a number");
		int n=scan.nextInt();//intializing the varible
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)//print square character
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		scan.close();
	}
	

}
