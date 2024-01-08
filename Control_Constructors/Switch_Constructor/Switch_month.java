package Switch_Constructor;
import java.util.Scanner;

public class Switch_month {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a first number");
		int num=s.nextInt();

		switch(num)
		{
		case 1:System.out.println("january");
		break;
		case 2:System.out.println("februray");
		break;
		case 3:System.out.println("march");
		break;
		case 4:System.out.println("april");
		break;
		case 5:System.out.println("may");
		break;
		case 6:System.out.println("june");
		break;
		case 7:System.out.println("july");
		break;
		case 8:System.out.println("august");
		break;
		case 9:System.out.println("sept");
		break;
		case 10:System.out.println("oct");
		break;
		case 11:System.out.println("nov");
		break;
		case 12:System.out.println("dec");
		break;
		default:System.out.println("invalid input");
		}
	}

}
