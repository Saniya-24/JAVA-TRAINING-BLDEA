package TrainingCodes;

import java.util.Scanner;

public class Program17 {
	public static int LinearSearch(int arr[], int key) {
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return (i+1);
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elements in array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the array element to be searched: ");
		int key=sc.nextInt();
		
		int res=LinearSearch(arr,key);
		
		if(res>0) {
			System.out.println("Element found in position "+res);
		}
		else {
			System.out.println("Element not found");
		}	
	}

}


