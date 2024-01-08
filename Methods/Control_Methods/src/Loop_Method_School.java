
public class Loop_Method_School {
	public static void School()
	{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=2;j++)
		{
			for(int k=1;k<=10;k++)
			{
				if(i%2!=0&&k%2==0)
				{
				System.out.println("Student"+i+" of the class "+j+" of the school "+k+" has completed the assignment");
			
				}
				else if(i%2==0&&k%2!=0)
				{
					System.out.println("Student"+i+" of the class "+j+" of the school "+k+" has not completed the assignment");
				}
				else
				{
					System.out.println("Student"+i+" of the class "+j+" of the school "+k+" has still doing the assignment");
				}
			}
		}
	}
	System.out.println("checking the assingment is completed");
	}

}
