package Control_Constructors;

import java.util.Scanner;

public class Program9_P_N_Z1 {

	public static void main(String[] args) {//main method
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a number");
		int num=scan.nextInt();//creating a variable
		 Program9_P_N_Z2 p=new  Program9_P_N_Z2();//creating a object
		 p.display(num);//invoking a method

	}

}
