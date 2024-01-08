package Control_Constructors;

import java.util.Scanner;

public class Program5_Capital1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for a scanner class
		System.out.println("enter a letter");
		char letter=scan.next().charAt(0);//creating a variable
		Program5_Captial2 p=new Program5_Captial2();//creating a object
		p.captial(letter);//invoking the method

	}

}
