package Arithemetic_oper_Constructors;

import java.util.*;
public class Contol_Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value");
		double num1=scan.nextDouble();
		System.out.println("enter a value2");
		double num2=scan.nextDouble();
		System.out.println("enter a operation");
		char ch=scan.next().charAt(0);
		if(ch=='+')
		{
			System.out.println(num1+num2);
		}
		else if(ch=='-')
		{
			System.out.println(num1-num2);
		}
		else if(ch=='*')
		{
			System.out.println(num1*num2);
		}
		else if(ch=='/')
		{
			System.out.println(num1/num2);
		}
		else 
		{
			System.out.println("invalid input");
		}
		
	
	
	
	

	}

}
