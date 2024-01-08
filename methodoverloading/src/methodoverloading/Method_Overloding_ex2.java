package methodoverloading;

public class Method_Overloding_ex2 {

	public static void GetMaggie()
	{
		System.out.println("bill for normal maggie is 30/-");
	}
	public static void GetMaggie(int quantity)
	{
		System.out.println("bill for "+quantity+" normal maggie is "+(quantity*30)+"/-");
	}
	public static void GetMaggie(String type)
	{
		System.out.println("bill for "+type+" maggie is 50/-");
	}
	public static void GetMaggie(int quantity,String type)
	{
		System.out.println("bill for "+type+" "+quantity+" maggie is "+(quantity*50)+"/-");
	}

	public static void main(String[] args) {
		GetMaggie();
		GetMaggie(2);
		GetMaggie("chessy");
		GetMaggie(2,"chessy");
		
		
	}


}
