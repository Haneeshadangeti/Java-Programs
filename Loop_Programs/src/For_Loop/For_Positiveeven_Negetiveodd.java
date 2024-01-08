package For_Loop;

public class For_Positiveeven_Negetiveodd {

	public static void main(String[] args) {
	for(int i=-100;i<=100;i++)//loop to print -100 to 100 numbers
	{
		if(i>0&&i%2==0)//if number is divide by 2 and less then 0 
		{
			System.out.println(i);
		}
		if(i<0&&i%2!=0)//if number is not divide by 2 and greater then 0 
		{
		 System.out.println(i);	
		}
	}

	}

}
