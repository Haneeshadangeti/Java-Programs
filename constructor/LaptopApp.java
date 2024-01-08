package constructor;

import java.util.Scanner;
public class LaptopApp {

	public static void main(String[] args) {
		
				Scanner scan=new Scanner(System.in);
				System.out.println("enter a brand");
				String a=scan.next();
				System.out.println("enter a processor");
				String b=scan.next();
				System.out.println("enter a os");
				String c=scan.next();
				Laptop l1=new Laptop(a,b,c);
				l1.switchon();
				l1.work();
				l1.shutdown();
				
				
				

			}

		}


	


