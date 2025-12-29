package LabAssNestedIf;

import java.util.Scanner;

public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Are you a citizen? (yes/no): ");
        String citizen = sc.nextLine();

        if (age >= 16) {
            if (citizen.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
		
		
	}
}
