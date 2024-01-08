package Do_While_Loop;

public class Do_While_Continue {

	public static void main(String[] args) {
		int i=1;
		do {
			if(i==6)
			{
				continue;
			
			}
			System.out.println(i);
			i++;
		}while(i<=10);

	}

}
