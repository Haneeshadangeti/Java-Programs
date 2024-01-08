package Arithemetic_oper_Constructors;

import java.util.*;
public class Control_Div {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num1");
		int num1=scan.nextInt();
		System.out.println("enter a num2");
		int num2=scan.nextInt();
		scan.close();
	
		if (num2==0)
		{
			System.out.println("the value of c is: Invalid division");
		}
		else
		{
			System.out.println(num1/num2);
		}

	}

}
