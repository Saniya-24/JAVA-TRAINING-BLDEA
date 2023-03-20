package TrainingCodes;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		
		if (age<18) {
			System.out.println("You are still a minor.Please grow up!!");
		}
		else if(age>65) {
			System.out.println("You are a senior citizen.Stop over expectations");
		}
		else {
			System.out.println("Congratulations. You are un the list of most eligible group");
		}

	}

}
