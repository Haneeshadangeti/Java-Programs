package constructor;

public class Laptop{
	String brand;
	String processor;
	String os;
	public Laptop(String a,String b,String c)
	{
		brand=a;
		processor=b;
		os=c;
	}
     void switchon()
     {
    	 System.out.println(brand +" laptop is switchon");
     }
     void work()
     {
    	 System.out.println(brand +" laptop is working java");
     }
     void shutdown()
     {
    	 System.out.println(brand +" laptop is switchon");
     }
}
     

