package Array2;
import java.util.*;
public class Array_Boolean {

	public static void main(String[] args) {
		
		      Scanner scan=new Scanner(System.in);
				System.out.println("enter a number of semesters:");
				int sem=scan.nextInt();//creating a sem variable
				
				String arr1[]=new String[sem];//type of array,size of array
				for(int i=0;i<=arr1.length-1;i++)//to store the values
				{
					System.out.println("is there any backlogs in "+(i+1)+" semster :");
					boolean res=scan.nextBoolean();
					if(res==true)//if it true print yes else no
					{
						arr1[i]="yes";
					}
					else
					{
						arr1[i]="no";
					}
						
				}
				for(int i=0;i<=arr1.length-1;i++)//to display the values
				{
					
					System.out.println("the backlogs in "+(i+1)+" semster is:"+arr1[i]);
					
				}
				scan.close();
	}
}
				

			

		

	


