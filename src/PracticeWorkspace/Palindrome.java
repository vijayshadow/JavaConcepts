package PracticeWorkspace;

import java.util.Scanner;

public class Palindrome {
	
	// PALINDROME NUMBER =121

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Check Palindrome :");
		int num = sc.nextInt();
		int org_num = num;
		int palinum = 0;
		System.out.println("Number Entered is :" + num);
		while (num != 0) {
			palinum = palinum * 10 + num % 10;
			num = (num / 10);
		}
		if (org_num == palinum) {
			System.out.println("This is Palindrome Number :" + palinum);
		} else {
			System.out.println("This is NOT Palindrome number :" + palinum);
		}
		
	}
}
