package Control_Constructors;

import java.util.Scanner;

public class Program6_Pass1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a result");
		int grade=scan.nextInt();//creating a variable
		Program6_Pass2 p=new Program6_Pass2();//creating a object
		p.result(grade);//invoking a method


	}

}
