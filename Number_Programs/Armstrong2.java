package Number_Programs;

public class Armstrong2 {
	public int power(int num,int count)//creating a method with 2 parameters and it returns a value
	{
		int res=(int)Math.pow(num,count);//calculating the power of number
		return res;

	}
	public int sumOfDigitsRaisedToPower(int num,int count)//creating a method with 2 parameters and it returns a value
	{
		Armstrong2 a=new Armstrong2();//creating a object
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;//calculating the digits of the number
			int res=a.power(rem, count);
			sum=sum+res;//perform addition
			num=num/10;//incrementing the number

		}
		return sum;
	}
}


