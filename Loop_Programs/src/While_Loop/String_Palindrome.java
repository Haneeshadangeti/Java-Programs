package While_Loop;
import java.util.Scanner;
public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   String s1=s.next();
   String temp="";
   for(int i=s1.length()-1;i>=0;i--)
   {
	   temp=temp+s1.charAt(i);
   }
   if(temp.equals(s1))
   {
	   System.out.println("yes");
   }
   else
   {
	   System.out.println("No");
   }
	}

}
