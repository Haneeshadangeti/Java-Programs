package Control_Constructors;

public class Program12_Polygon {
	void display(int sides)//creating method with one parameter
	{
		switch(sides)//using switch  
		{
		case 4:System.out.println("Quadrilateral");
		break;
		case 5:System.out.println("pentagon");
		break;
		case 6:System.out.println("hexagon");
		break;
		case 7:System.out.println("heptagon");
		break;
		case 8:System.out.println("octagon");
		break;
		case 9:System.out.println("nonagon");
		break;
		case 10:System.out.println("decagon");
		break;
		default:System.out.println("invalid side");
		}
	}

}
