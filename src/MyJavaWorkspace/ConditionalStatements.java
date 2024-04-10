package MyJavaWorkspace;

public class ConditionalStatements {

	public static void main(String[] args) {

		/*
		 * Conditional Statements 1. if 2. if ..else 3. nested if else 4. SwitchCase *
		 * 
		 */

		int num = 0;
		ifelse(num);
		int weekend = 5;
		switchCase(weekend);

	}

	public static void ifelse(int num) {

		if (num > 0) {
			System.out.println("Positive Number ");
		} else if (num < 0) {
			System.out.println("Negative Number ");
		} else {
			System.out.println("Number is Zero ");
		}

	}

	public static void switchCase(int weekend) {
		switch (weekend) {
		case 0:
			System.out.println("Hurry Today is SUNDAY!!");
			break;
		case 1:
			System.out.println("Hurry Today is MONDAY!!");
			break;
		case 2:
			System.out.println("Hurry Today is TUESDAY!!");
			break;
		case 3:
			System.out.println("Hurry Today is WEDNESDAY!!");
			break;
		case 4:
			System.out.println("Hurry Today is THURSDAY!!");
			break;
		case 5:
			System.out.println("Hurry Today is FRIDAY!!");
			break;
		case 6:
			System.out.println("Hurry Today is SATURDAY!!");
			break;
		default:
			System.out.println("INVALID ENTRY OF WEEKEND");
			break;
		}
	}
}
