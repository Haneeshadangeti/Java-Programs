package Switch_Constructor;
import java.util.*;
public class Switch_calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a first number");
		double num1=s.nextDouble();
		System.out.println("enter a second number");
		double num2=s.nextDouble();
		System.out.println("enter a operation");
		char operation =s.next().charAt(0);
		s.close();
		switch(operation)
		{
		case '+':System.out.println(num1+num2);
		break;
		case '-':System.out.println(num1-num2);
		break;
		case '*':System.out.println(num1*num2);
		break;
		case '/':System.out.println(num1/num2);
		break;
		default:System.out.println("invalid input");
		}
		

	}

}
