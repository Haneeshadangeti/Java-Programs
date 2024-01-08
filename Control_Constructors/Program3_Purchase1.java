package Control_Constructors;

import java.util.Scanner;

public class Program3_Purchase1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a purchase");
		int discount=scan.nextInt();
		Program3_Purchase2 p=new  Program3_Purchase2();
		p.Discount(discount);
		scan.close();

	}

}
