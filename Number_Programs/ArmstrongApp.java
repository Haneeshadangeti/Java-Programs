package Number_Programs;
import java.util.Scanner;

public class ArmstrongApp {

	public static void main(String[] args) {
		//creating a object for scanner class
       Scanner scan=new Scanner(System.in);
       System.out.println("enter a number");
          int num=scan.nextInt();//creating a variable
          scan.close();
          int original=num;//Initializing the num value to original variable
        int count=0;//initializing the count variable
          while(num!=0)
          {
        	  num=num/10;
        	  count++;
        	  
          }
          
          Armstrong2 A=new Armstrong2();//creating a object 
          int res1=A.sumOfDigitsRaisedToPower(original, count);//invoking the method and storing it into a variable
          if(res1==original)//check res1 value and original value both are equal or not
     	 {
     		 System.out.println(original+" is a armstrong number");
     	 }
     	 else
     	 {
     		 System.out.println(original+" is not a armstrong");
     	 }
      }
     }





