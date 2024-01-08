package Array2_2D;
import java.util.Scanner;
public class Array_2D {

	public static void main(String[] args) {
		//creating a object for scanner class
		      Scanner scan=new Scanner(System.in);
				System.out.println("enter number of companies");
				int company=scan.nextInt();
				System.out.println("enter number of employee");
				int employee=scan.nextInt();
				String [][]arr1=new String[company][employee];//creating a array
				//storing the values
				for(int i=0;i<=arr1.length-1;i++)//giving for loop for classes
				{
					for(int j=0;j<=arr1.length-1;j++)//giving for loop for students
					{
						System.out.println("enter the names of "+(i+1)+" company "+(j+1)+" employee :");
						arr1[i][j]=scan.next();
					}
				}
				//display the values
				for(int i=0;i<=arr1.length-1;i++)
				{
					for(int j=0;j<=arr1.length-1;j++)
					{
						System.out.println("the names of "+(i+1)+" company "+(j+1)+" employee:"+arr1[i][j]);
					}
				}
				scan.close();

			}

		

	}


