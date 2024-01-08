package construtors_Methods;
import java.util.Scanner;

public class Control_Method_char {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a Input");
		char ch=scan.next().charAt(0);
		scan.close();
		alphabets(ch);
	}
		public static void alphabets(char ch)
		{
			
			//check whether the character is uppercase
        if (ch=='A'&&ch=='z')
		{
			System.out.println("uppercase");
		}
		////check whether the character is lower
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


