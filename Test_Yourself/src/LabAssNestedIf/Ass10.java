package LabAssNestedIf;

import java.util.Scanner;

public class Ass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

        System.out.print("Enter performance rating (Excellent/Good/Average): ");
        String rating = sc.nextLine();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus;

        if (rating.equalsIgnoreCase("Excellent")) {
            if (years >= 5) {
                bonus = 10000;
            } else {
                bonus = 7000;
            }
        } else if (rating.equalsIgnoreCase("Good")) {
            if (years >= 5) {
                bonus = 7000;
            } else {
                bonus = 4000;
            }
        } else if (rating.equalsIgnoreCase("Average")) {
            if (years >= 5) {
                bonus = 4000;
            } else {
                bonus = 2000;
            }
        } else {
            bonus = 0;
        }

        System.out.println("Bonus amount: $" + bonus);

        sc.close();
		
		
	}
}
