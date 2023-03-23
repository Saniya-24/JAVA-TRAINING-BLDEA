package TrainingCodes;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		System.out.println("Enter the count of Movie House: ");
		Scanner sc=new Scanner(System.in);
		int mv=sc.nextInt();
		System.out.println("Enter the count of Theaters: ");
		int th=sc.nextInt();
		System.out.println("Enter the count of Screen: ");
		int scr=sc.nextInt();
		
		
		int arr[][][]=new int[mv][th][scr];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the Movie House no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside the Theater no: "+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the capacity of Screen no: "+(k+1));
				arr[i][j][k]=sc.nextInt();	
			}
		}
	}
		System.out.println("-------------------------------------------");
	
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the Movie House no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside the Theater no: "+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("The funds collected from Screen no: "+(k+1) );
				int fund=arr[i][j][k]*350;
				System.out.println(fund);

				}
			}
		}
	}
}