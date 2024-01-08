package Control_Constructors;

import java.util.Scanner;

public class Program2_Adult1 {

	public static void main(String[] args) {//main method
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a age");//printing a message
		int age=scan.nextInt();//creating a variable
		Program2_Adult2 p=new Program2_Adult2();//creating a object
		p.Adult(age);//invoking a method
		scan.close();

	}

}
