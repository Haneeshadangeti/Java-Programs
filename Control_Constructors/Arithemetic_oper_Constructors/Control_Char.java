package Arithemetic_oper_Constructors;

import java.util.*;
public class Control_Char {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.println("enter a Input");
				char ch=scan.next().charAt(0);
				//check whether the character is uppercase
				if (Character.isUpperCase(ch))
				{
					System.out.println("uppercase");
				}
				//check whether the character is lower
				else if(Character.isLowerCase(ch))
				{
					System.out.println("lower case");
				}
				//check whether the character is number
				else if(Character.isDigit(ch))
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
