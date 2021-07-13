import java.util.Arrays;
import java.util.Scanner;

public class Median_Of_Two_Sorted_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter your array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
			
	Arrays.sort(arr);
	
	System.out.println("Array is :");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
		
	int n= arr.length;
	if(n%2!=0) {
	int k=n/2;
	System.out.println("Median is :");
	System.out.println(arr[k]);
	}
	
	else
	{
		int k=n/2;
		//System.out.println("median is :");
		int addition=arr[k-1]+arr[k];
		float anss=(float)addition/2;
		System.out.println("Median is :"+anss);	
		
	}
	}

}
