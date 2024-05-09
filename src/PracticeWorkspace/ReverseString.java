package PracticeWorkspace;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Lovely";
		reverseString(string);
		//System.out.println(reverseString(string) + " words.");

	}
	
	public static void reverseString(String string) {
		String str = string;
		String reverse = "";
		int rstr = string.length();

		//char ch[] = new char[string.length()];
		for (int i=string.length()-1;i>=0;i--) {
			System.out.println(string.charAt(i));
			reverse = reverse + str.charAt(i);
			
		}
		System.out.println(reverse);
		
	}


}
