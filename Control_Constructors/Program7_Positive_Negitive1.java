package Control_Constructors;

import java.util.Scanner;

public class Program7_Positive_Negitive1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a number");
		int num=scan.nextInt();//creating a variable
		Program7_Positive_Negitive2 p=new Program7_Positive_Negitive2();//creating a object
		p.display(num);//invoking a method
	}

}
