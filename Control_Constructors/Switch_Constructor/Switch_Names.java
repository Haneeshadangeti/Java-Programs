package Switch_Constructor;
import java.util.*;
public class Switch_Names {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a name");
		String name=s.next();
		s.close();
		switch(name)
		{
		case "ajay":System.out.println(name+" lives in delhi ");
		break;
		case "arjun":System.out.println(name+" lives in pune ");
		break;
		case "ankit":System.out.println(name+" lives in banglore");
		break;
		case "akash":System.out.println(name+" lives in hyderabad ");
		break;
		default:System.out.println(name+" lives in India");
		}
		
		
		

	}

}
