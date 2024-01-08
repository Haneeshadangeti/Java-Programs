package Control_Constructors;

public class Program11_Child {
	void display(int age)//Creating a method with one parameter
	{
		if(age<=12)//checking the person is child or not 
		{
			System.out.println("child");
		}
		else if(age>=13&&age<=19)//checking the person is teen
		{
			System.out.println("teen");
		}
		else if(age>=20&&age<=59)//checking the person is adult
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior");
		}
	}

}
