package Do_While_Loop;

public class Do_While_Positiveeven_Negitiveodd {

	public static void main(String[] args) {
		int i=-100;
		do {
			if(i>0&&i%2==0)
			{
				System.out.println(i);
			}
			if(i<0&&i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=100);

	}

}
