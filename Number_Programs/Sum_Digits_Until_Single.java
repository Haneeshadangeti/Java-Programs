package Number_Programs;

public class Sum_Digits_Until_Single {
	void display(int num)
	{
		int sum=0;
	 while(num!=0||sum>9) {
		if(num==0)
		{ 
			num=sum;
			sum=0;
		}	
		int a=num%10;
		sum+=a;
		num=num/10;
	    
	 }
	 System.out.println(sum);
}
}