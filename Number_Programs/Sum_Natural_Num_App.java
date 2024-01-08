package Number_Programs;
import java.util.Scanner;

public class Sum_Natural_Num_App {

	public static void main(String[] args) {
	//creating a object for scanner class
      Scanner scan=new Scanner(System.in);
       System.out.println("enter a number");
        int num=scan.nextInt();//initializing a variable
        Sum_Natural_Num s=new Sum_Natural_Num();//creating a object
        s.display(num);//invoking a method

	}

}
