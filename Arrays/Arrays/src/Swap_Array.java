import java.util.Scanner;

public class Swap_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=scan.nextInt();//creating a variable
		int []arr=new int[size];//creating a 2D array
		for(int i=0;i<=arr.length-1;i++)//to store array
		{
			System.out.println("enter the number "+(i+1)+ " index:");
			arr[i]=scan.nextInt();
		}
		System.out.print("before swapping the elements in array:");
		for(int i=0;i<=arr.length-1;i++)//to display the array 
		{
			System.out.print(arr[i]+" ");//printing before swapping
		}
		System.out.println();
		System.out.println("enter the index1:");
		int index1=scan.nextInt();
		System.out.println("enter the index2:");
		int index2=scan.nextInt();
		int temp=0;
		
		if(index1<=arr.length-1&&index2<=arr.length-1)//swapping the indexes in the array
		{
			
			temp=arr[index1];
			arr[index1]=arr[index2];
			arr[index2]=temp;
			
		}
		else
		{
			System.out.println("size is out of the range");
		}
		System.out.print("after swapping elements in array:");
		for(int i=0;i<=arr.length-1;i++)// to display the elements in the array after the swapping
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		scan.close();


	}

}
