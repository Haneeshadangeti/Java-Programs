package For_Loop;
import java.util.Scanner;

public class For_Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
		int fact=1;//initializing the variable
		
	for(int i=1;i<=n;i++)//loop to print n numbers
	{
	fact*=i;
	System.out.println(fact);
	}
	scan.close();

	}
	

}
