package Control_Constructors;
import java.util.Scanner;

public class Program22_MethodApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
		Program22_Methods p=new Program22_Methods();//creating a object
		if(n>100)//checking the number is greater than 100 or not
		{
		p.divisiblity2(n);//invoking a method divisiblity2
		p.divisibility3(n);//invoking a method divisibility3
		p.divisiblity5(n);//invoking a method divisiblity5
		p.divisiblity_2and5(n);//invoking a method divisiblity_2and5
		p.divisiblity_3and5(n);//invoking a method divisiblity_3and5
		p.odd_Divisible5(n);//invoking a method odd_Divisible5
		p.even_Divisible3(n);//invoking a method even_Divisible3
		p.even_Prime(n);//invoking a method even_Prime
		p.prime(n);
		p.odd_prime(n);
		
		}
		else
		{
			System.out.println("enter a number which is greater than 100");
		}
	
	}
}	
		

	


