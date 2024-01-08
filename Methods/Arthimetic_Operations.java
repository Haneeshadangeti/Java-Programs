package Methods;
import java.util.*;
public class Arthimetic_Operations {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object from scanner class
		System.out.println("enter a number");
		int num1=scan.nextInt();//creating a variable
		System.out.println("enter a number");
		int num2=scan.nextInt();//creating a variable
		System.out.println("the subtraction is : "+subtractNumbers(num1,num2));//invoking the method
		System.out.println("the multiplicationis : "+multiplyNumbers(num1,num2));//invoking the method
		System.out.println("the division is : "+divideNumbers(num1,num2));//invoking the method
		System.out.println("the findremainder is : "+findRemainder(num1,num2));//invoking the method
		scan.close();
		

	}
	public static int subtractNumbers(int num1, int num2)//creating a method with 2 parameters and returning a value
	{
		return num1-num2;//performing subtraction operation
	}
    public static int multiplyNumbers(int num1, int num2)//creating a method with 2 parameters and returning a value
    {
    	return num1*num2;//performing multiplication operation
    }
    public static double divideNumbers(int num1, int num2)//creating a method with 2 parameters and returning a value
    {
       return num1/num2; 	//performing division operation
    }
     public static int findRemainder(int num1, int num2)//creating a method with 2 parameters and returning a value
     {
    	 return num1%num2;//performing modulo divison operation
     }

}
