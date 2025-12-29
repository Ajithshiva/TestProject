package LabAssNestedIf;

import java.util.Scanner;

public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice (Sandwich/Pasta): ");
        String food = sc.nextLine();

        if (food.equalsIgnoreCase("Sandwich")) {
            System.out.println("Do you want chips? (yes/no): ");
            String chips = sc.nextLine();
            if (chips.equalsIgnoreCase("yes")) {
                System.out.println("You ordered a Sandwich with chips.");
            } else {
                System.out.println("You ordered a Sandwich.");
            }
        } else if (food.equalsIgnoreCase("Pasta")) {
            System.out.println("Do you want garlic bread? (yes/no): ");
            String bread = sc.nextLine();
            if (bread.equalsIgnoreCase("yes")) {
                System.out.println("You ordered Pasta with garlic bread.");
            } else {
                System.out.println("You ordered Pasta.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
		
		
	}
}
