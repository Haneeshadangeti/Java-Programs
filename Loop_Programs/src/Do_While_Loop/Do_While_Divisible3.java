package Do_While_Loop;

public class Do_While_Divisible3 {

	public static void main(String[] args) {
		int sum=0;
	int i=1;
	do {
		if(i%3==0)
		{
			sum=sum+i;
		}
		i++;
	}while(i<=50);
System.out.println(sum);
	}

}
