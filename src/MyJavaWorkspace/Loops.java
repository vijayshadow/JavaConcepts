package MyJavaWorkspace;

public class Loops {
	
	public static void main(String[] args) {

		/*
		 * Loops Statements 
		 * 1. while loop
		 * 2. do while loop
		 * 3. for loop
		 * 4. Enchanced for loop/for each loop
		 * 
		 */
		
		whileLoop();
		dowhileLoop();
		forLoop();
	}
	
	public static void whileLoop() {
		int i = 1;
		while (i < 11) {
			
			if (i % 2 == 0) {
				System.out.println(i + " IS EVEN NUMBER");
			} else {
				System.out.println(i + " IS ODD NUMBER");
			}
			i+=1; //i++;
		}

	}
	
	public static void dowhileLoop() {
		int i = 1;
		do {
			System.out.println("Value of I is : " +i);
			i++;
			
		}while (i < 11);

	}

	public static void forLoop() {
		for (int i = 0; i < 11; i++) {
			System.out.println("Value for I is : " + i);
		}

	}
}
