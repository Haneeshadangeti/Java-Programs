package Methods;

import java.util.*;
public class Decoder {
	public int msgdecoder(char ch)//creating a method with 1 parameter and return a value
	{
		return (int)ch;//perform type conversion from character to integer
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);//creating a object from scanner class 
	    System.out.println("enter a character");
	    char ch=scan.next().charAt(0);//creating a variable
	    Decoder d1=new Decoder();//creating a object
	    System.out.println(d1.msgdecoder(ch));//invoking a method
			scan.close();	
		

	}

}
