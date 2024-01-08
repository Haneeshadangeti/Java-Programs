package Methods;
import java.util.Scanner;

public class Double_Trouble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object from scanner class 
		System.out.println("enter a number");
		int num=scan.nextInt();//creating a variable
		System.out.println("the double of number is: "+DoubleThenumber(num));//invoking a method
		scan.close();//closing a scanner class

	}
	public static int DoubleThenumber(int num)//creating a method with 1 parameters and returning a value
	{
		return num*2;//performing the multiplication operation
	}

}
