package Number_Patterns;
import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number of rows");
		int n=scan.nextInt();//creating a variable
		int evencount=2;//initializing the variable
		int oddcount=1;//initializing the variable
		if(n%2==0) // if n value is divide by 2 perform opertion
		{
			display(n,evencount,oddcount);
		}
		else
		{
			System.out.println("please enter a even number");
		}
		scan.close();
	}
		public static void display(int n,int evencount,int oddcount)//creating a method with 3 parameters
		{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(evencount<=9)//if evencount is less than or equal to 9 then print
				{
					System.out.print("0"+evencount+" ");
					
				}
				else
				{
					System.out.print(evencount+" ");
				}
				evencount+=2;//increment the value
			}
			System.out.println();
		}
		for(int i=n/2;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(oddcount<=9)//if oddcount is less than or equal to 9 then print
				{
					System.out.print("0"+oddcount+" ");
				}
				else
				{
					System.out.print(oddcount+" ");
				}
				oddcount+=2;//increment the oddcount
			}
			System.out.println();
		}
		
	}

}
