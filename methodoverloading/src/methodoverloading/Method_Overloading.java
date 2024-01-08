package methodoverloading;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10,b=20;
        float p=30.5f,q=20.2f;
        double m=200.4,n=300.5;
        System.out.println(add(p,q));
	}
	public static double add(int a,int b)
	{
		return a+b;
	}
	public static double add(double x,float y)
	{
		return x+y;
	}

}
