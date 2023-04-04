package TrainingCodes;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();

		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' || i==str.length()-1) {
				count++;
			}
		}
		System.out.println("Word Count = "+count);

	}

}
