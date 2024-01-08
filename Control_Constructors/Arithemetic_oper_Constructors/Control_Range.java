package Arithemetic_oper_Constructors;

import java.util.*;
public class Control_Range {

	public static void main(String[] args) {
		//creating the object of scanner class
		Scanner scan=new Scanner(System.in);
		//we are asking user to number
		System.out.println("enter a number");
		//storing a number in variable num
		int num=scan.nextInt();
		scan.close();
		//checking whether the number is present inside in range from 1 to 10
		if(num>=1 && num<=10)
		{
			System.out.println("range 1");
		}
		//checking whether the number is present inside in range from 11 to 20
		else if(num>=11 && num<=20)
		{
			System.out.println("range 2");
		}
		//checking whether the number is present inside in range from 21 to 30
		else if(num>=21 && num<=30)
		{
			System.out.println("range 3");
		}
		//checking whether the number is present inside in range from 31 to 40
				
	    else if(num>=31 && num<=40)
	   {
		System.out.println("range 4");
	   }
		//checking whether the number is present inside in range from 41 to 50
	    else if(num>=41&&num<=50)
		   {
			System.out.println("range 5");
		   }
		//checking whether the number is present outside of the range
	    else
	    {
	    	System.out.println("outside of range");
	    }
	}
}
