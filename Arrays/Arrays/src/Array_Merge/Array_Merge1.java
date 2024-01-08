package Array_Merge;



public class Array_Merge1 {
	int[] display(int arr1[],int arr2[]){
		
		int[] res=new int[arr1.length+arr2.length];
		int i=0;
		int index=0;
		while(i<=arr1.length)
		{
			res[index]=arr1[i];
			i++;
			index++;
		}
		while(i<=arr2.length)
		{
			res[index]=arr2[i];
			i++;
			index++;
		}
		return res;
	}
}
