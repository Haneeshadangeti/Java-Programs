package Number_Patterns;
import java.util.Scanner;

public class Pattern24{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number of rows");
		int n=scan.nextInt();//creating a varaible
	
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(k<=9)//if k is less then 9 
				{
					System.out.print(" "+k+" ");
					k++;
				}
				else 
				{
				System.out.print(k+" ");
				k++;
				}
			}
				System.out.println();
				
			}
		scan.close();//closing a scanner class
			
		}
	

}
