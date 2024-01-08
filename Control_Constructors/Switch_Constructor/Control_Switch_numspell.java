package Switch_Constructor;
import java.util.Scanner;

public class Control_Switch_numspell {

	public static void main(String[] args) {	
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
	
	switch(num)
	{
	case 1:System.out.println("one");
	break;
	case 2:System.out.println("two");
	break;
	case 3:System.out.println("three");
	break;
	
	case 4:System.out.println("four");
	break;
	case 5:System.out.println("five");
	break;
	default:System.out.println("invalid divison");
	}

}
}
