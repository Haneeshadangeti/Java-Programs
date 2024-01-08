package Methods;

import java.util.Scanner;

public class Power_Squares {
	
	public static int Squares(int num)//creating a method using a 1 parameter
	{
		return num*num;//calculating a squares of number
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		int num=scan.nextInt();//creating a  variable
		System.out.println("the power of squares:"+Squares(num));//invoking the method 
		scan.close();


	}

}
