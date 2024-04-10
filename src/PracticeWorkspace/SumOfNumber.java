package PracticeWorkspace;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Count number of digits in a number !!");
		System.out.println("Provide the Number to Validate :");
		int num = sc.nextInt();
		int cnt = 0, sumcnt = 0, tempnum;
		int even = 0, odd = 0;
		while (num != 0) {
			tempnum = num % 10;
			sumcnt += tempnum;
			if (tempnum % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num = num / 10;
			cnt++;

		}
		System.out.println("COUNT THE NUMBER OF DIGITS :" + cnt);
		System.out.println("TOTAL OF NUMBER :" + sumcnt);
		System.out.println("NUMBER OF EVEN COUNT :" + even);
		System.out.println("NUMBER OF ODD COUNT :" + odd);

	}

}
