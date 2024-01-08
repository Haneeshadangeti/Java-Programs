package Shadowing_Problem;

public class Student {
	String name;//instance variables
	int rollno;
	int age;
	float percentage;
	public void study()//data members
	{
		System.out.println(name+" is studying");
	}
	public Student(String name,int rollno,int age,float percentage)//local variables
	{
		//shadowing problem
		name=name;
		rollno=rollno;
		age=age;
		percentage=percentage;
	}

}
