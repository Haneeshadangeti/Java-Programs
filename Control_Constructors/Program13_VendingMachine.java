package Control_Constructors;

public class Program13_VendingMachine {
	void display(String product)//creating a method with one parameter
	{
		switch(product)//using switch constructor for products
		{
		case "p001":System.out.println("Mascara");
		break;
		case "p002":System.out.println("Eye Liner");
		break;
		case "p003":System.out.println("Eye Lashes");
		break;
		case "p004":System.out.println("Compact powder");
		break;
		case "p005":System.out.println("Lipstick");
		break;
		case "p006":System.out.println("perfume");
		break;
		case "p007":System.out.println("Bangles");
		break;
		default:
			System.out.println("invalid product code");
		
		}
	}

}
