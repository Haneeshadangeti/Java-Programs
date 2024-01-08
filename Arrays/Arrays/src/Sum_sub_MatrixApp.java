import java.util.Scanner;

public class Sum_sub_MatrixApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int row=scan.nextInt();//creating a variable
		System.out.println("enter the number of columns:");
		int col=scan.nextInt();//creating a variable
		int [][]arr1=new int[row][col];//creating a 2D array
		int [][]arr2=new int[row][col];//creating a 2D array
		int [][]arr3=new int[row][col];//creating a 2D array
		Sum_sub_Matrix S =new Sum_sub_Matrix();//creating a object for Sum_sub_Matrix
		S.Matrix1(arr1);//invoking a method 
		S.matrix2(arr2);//invoking a method
		S.matrixsum(arr1, arr2, arr3);//invoking a method 
		S.matrixsub(arr1,arr2,arr3);//invoking a method
		scan.close();//closing a scanner class
	}
	

}
