package Practice;

public class Try4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n = 4;  // number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print decreasing numbers
            num = num - 2; 
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }

            // Move to next line
            System.out.println();
        }

		
	}

}
