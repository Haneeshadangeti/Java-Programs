package Control_Constructors;

import java.util.Scanner;

public class Program8_Senior1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class 
		System.out.println("enter a age");
		int age=scan.nextInt();//creating a variable
		Program8_Senior2 p=new Program8_Senior2();//creating a object
		p.display(age);//invoking a method

	}

}
