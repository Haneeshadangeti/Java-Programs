package Number_Programs;

public class GCD {
	void display(int num1,int num2)
	{
		int temp=0;
		while(num1>num2)
		{
			 temp=num1%num2;
			num1=temp;
		}
		System.out.println(num1);
	}
}
