package Methods;

import java.util.Scanner;

public class String_Joins {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a string1");
		String str1=scan.next();//creating a  variable
		System.out.println("enter a string2");
		String str2=scan.next();//creating a  variable
		System.out.println(joinStrings(str1,str2));
		scan.close();

	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+" "+str2;//string concatenation
	}

}
