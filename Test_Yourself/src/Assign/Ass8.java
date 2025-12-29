package Assign;

public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 5;  // height of pyramid

        for (int r = 1; r <= rows; r++) {
            // print spaces (to align stars in center)
            for (int s = 0; s < rows - r; s++) {
                System.out.print("  ");
            }

            // print stars with a space after each
            for (int star = 0; star < (2 * r - 1); star++) {
                System.out.print("* ");
            }

            System.out.println(); // move to next line
        }
		
	}

}
