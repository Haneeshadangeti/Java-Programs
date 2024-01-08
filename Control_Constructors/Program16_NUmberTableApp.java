package Control_Constructors;
import java.util.*;
public class Program16_NUmberTableApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);//creating a object for scanner class
	System.out.println("enter a number");
	int num=scan.nextInt();//creating a variable
	 Program16_NUmberTable p= new  Program16_NUmberTable();//creating a object
	 p.display(num);//invoking a method
	
	}

}
