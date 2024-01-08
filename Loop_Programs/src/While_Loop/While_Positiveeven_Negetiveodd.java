package While_Loop;

public class While_Positiveeven_Negetiveodd {

	public static void main(String[] args) {
	int i=-100;
	while(i<=100)
	{
		if(i>0&&i%2==0)
		{
			System.out.println(i);
		}
		if(i<0&&i%2!=0)
		{
			System.out.println(i);
		}
		i++;
	}

	}

}
