package TrainingCodes;

import java.util.Arrays;
import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array1: ");
		 int m=sc.nextInt();
		 int arr1[]=new int[m];
		 System.out.println("Enter the elements for array1:");
		 for(int i=0;i<m;i++) {
			 arr1[i]=sc.nextInt();
		 }
		 System.out.println("Enter the size of array2: ");
		 int n=sc.nextInt();
		 int arr2[]=new int[n];
		 System.out.println("Enter the elements for array2:");
		 for(int i=0;i<n;i++) {
			 arr2[i]=sc.nextInt();
		 }
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 
		 if(arr1.length==arr2.length) {
			 for(int i=0;i<arr1.length;i++) {
				 if(arr1[i]!=arr2[i] ) {
					 System.out.println("Arrays not equal");
					 System.exit(0);
				 }
			 }
			 System.out.println("Arrays are equal");
		 }
		 else {
			 System.out.println("Arrays are not equal");
		 }

	}

}
