package Control_Constructors;

import java.util.Scanner;

public class Program4_Vote1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a age");
		int age=scan.nextInt();//creating a variable
		Program4_Vote2 p=new Program4_Vote2();//creating a object
		p.vote(age);//invoking the object
		scan.close();
		

	}

}
