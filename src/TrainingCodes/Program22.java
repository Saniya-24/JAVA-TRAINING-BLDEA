package TrainingCodes;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int vowel=0;
		int cons=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||
			    str.charAt(i)=='i' || str.charAt(i)=='o' ||
				str.charAt(i)=='u') {
				vowel++;
			}
			else {
				cons++;
			}
		}
		System.out.println("Vowel count ="+vowel);
		System.out.println("Consonant count ="+cons);

	}

}
