package TrainingCodes;

import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		
		System.out.println(str.replaceAll("[aeiou]","@"));
		
		}
		
		
			
		
		
	}



