package Arithemetic_oper_Constructors;

import java.util.*;
public class Control_Add {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num1");
		int num1=scan.nextInt();
		System.out.println("enter a num2");
		int num2=scan.nextInt();
		if(num1>num2)
		{
			System.out.println(num1-num2);
			
		}
		else
		{
			System.out.println(num2-num1);
		}

	}

}
