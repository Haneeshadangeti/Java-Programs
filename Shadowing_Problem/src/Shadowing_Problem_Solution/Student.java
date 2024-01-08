package Shadowing_Problem_Solution;

public class Student {
	String name;//instance variables
	int rollno;
	int age;
	float percentage;
	void study()//data members
	{
		System.out.println(name+" is studying");
	}
	public Student(String name,int rollno,int age,float percentage)//local variables
	{
		//shadowing problem solution
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.percentage=percentage;
	}



}
