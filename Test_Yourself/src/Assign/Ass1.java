package Assign;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * { System.out.print("Kaali"); }
		 * 
		 * System.out.println("Bayata");
		 */
		
		int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping without third variable
        
		/*
		 * a = a + b; // a = 10 + 20 = 30 b = a - b; // b = 30 - 20 = 10 a = a - b; // a
		 * = 30 - 10 = 20
		 */
        
        // Swapping using third variable
        int temp = a;  // store a
        a = b;         // assign b to a
        b = temp;      // assign temp (old a) to b
        
        System.out.println("After Swap: a = " + a + ", b = " + b);
		
		
		
	}

}
