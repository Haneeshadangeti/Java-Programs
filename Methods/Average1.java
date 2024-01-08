package Methods;

import java.util.Scanner;

public class Average1 {
	//creating the method with 8 parameter and return value
		public double Average(int sem1,int sem2,int sem3,int sem4,int sem5,int sem6,int sem7,int sem8)
		{
			
	      return ((double)(sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8);//calculating the average
		}

		public void main(String[] args) {
			Scanner scan= new Scanner(System.in);//creating a object for scanner class 
			int sem1=scan.nextInt();//creating a variable
			int sem2=scan.nextInt();//creating a variable
			int sem3=scan.nextInt();//creating a variable
			int sem4=scan.nextInt();//creating a variable
			int sem5=scan.nextInt();//creating a variable
			int sem6=scan.nextInt();//creating a variable
			int sem7=scan.nextInt();//creating a variable
			int sem8=scan.nextInt();//creating a variable
			//creating a object 
			Average1 a1= new Average1();//creating a object
			System.out.println("the average is : "+a1.Average(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8));//invoking the method
			scan.close();

		}

	}


