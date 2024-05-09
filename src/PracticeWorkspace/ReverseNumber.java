package PracticeWorkspace;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println(" REVERSE NUMBER IS : " + revNumber());

	}

	public static int revNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the Number to Validate :");
		int revnumber = sc.nextInt();
		System.out.println(" Number Given is : " + revnumber);
		int rev = 0;
		while (revnumber != 0) {
			rev = rev * 10 + revnumber % 10;
			revnumber = (revnumber / 10);
			System.out.println("rev:"+rev);
			System.out.println("revnumber:"+revnumber);
		}

		return (rev);
	}
}
