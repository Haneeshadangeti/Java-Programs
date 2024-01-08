package Arithemetic_oper_Constructors;

import java.util.Scanner;

public class Control_Char1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a Input");
		char ch=scan.next().charAt(0);
		scan.close();
		//check whether the character is uppercase
        if (ch=='A'&&ch=='z')
		{
			System.out.println("uppercase");
		}
		//check whether the character is lower
		else if(ch=='a'&&ch=='b')
		{
			System.out.println("lower case");
		}
		//check whether the character is number
        else if(ch>='0'&& ch<='9')
		{
			System.out.println("Number");
		}
		//check whether the character is special character
		else 
		{
			System.out.println("special character");
		}
					

	}

}
