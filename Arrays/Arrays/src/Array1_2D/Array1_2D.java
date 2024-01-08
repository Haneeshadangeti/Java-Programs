package Array1_2D;
import java.util.Scanner;
public class Array1_2D {
    public static void main(String[] args) {
		//creating a object for scanner class
		Scanner scan=new Scanner(System.in);
		int [][]arr1=new int[2][5];//creating a array
		//storing the values
		for(int i=0;i<=1;i++)//giving for loop for classes
		{
			for(int j=0;j<=4;j++)//giving for loop for students
			{
				System.out.println("enter the marks of "+(i+1)+" class "+(j+1)+" student :");
				arr1[i][j]=scan.nextInt();
			}
		}
		//display the values
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.println("the marks of "+(i+1)+" class "+(j+1)+" student:"+arr1[i][j]);
			}
		}
		scan.close();

	}

}
