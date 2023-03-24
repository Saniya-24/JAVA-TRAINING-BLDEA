package TrainingCodes;

import java.util.Scanner;

public class Program19 {
	
	public static void main(String[] args) {
		System.out.println("Enter the count of classes: ");
		 Scanner sc = new Scanner(System.in);
		 int cls=sc.nextInt();
		 
		 int arr[][]=new int[cls][];
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Inside the class "+(i+1));
				 System.out.println("Enter the count of student inside class "+(i+1));
				 arr[i]=new int[sc.nextInt()];
			 
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Inside the class "+(i+1));
			 for(int j=0;j<arr[i].length;j++) {
			 System.out.println("Enter the marks of student "+(j+1));
			 arr[i][j]=sc.nextInt();
			 }
		 }
		 System.out.println("-------------------------------");
		
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Inside the class "+(i+1));
			 for(int j=0;j<arr[i].length;j++) {
			 System.out.println("The marks of student"+(j+1)+" is: " + arr[i][j]);
			 }
		 } 
	}
}