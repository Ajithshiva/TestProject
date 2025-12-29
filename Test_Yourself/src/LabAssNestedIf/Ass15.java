package LabAssNestedIf;

import java.util.Scanner;

public class Ass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter pet type (dog/cat/other): ");
        String type = sc.nextLine();

        System.out.print("Enter pet age in years: ");
        int age = sc.nextInt();

        if (type.equalsIgnoreCase("dog")) {
            if (age < 2) {
                System.out.println("Available: Puppy dogs under 2 years old.");
            } else {
                System.out.println("Available: Adult dogs 2 years and older.");
            }
        } else if (type.equalsIgnoreCase("cat")) {
            if (age < 2) {
                System.out.println("Available: Kittens under 2 years old.");
            } else {
                System.out.println("Available: Adult cats 2 years and older.");
            }
        } else if (type.equalsIgnoreCase("other")) {
            if (age < 1) {
                System.out.println("Available: Young small pets under 1 year old.");
            } else {
                System.out.println("Available: Adult small pets 1 year and older.");
            }
        } else {
            System.out.println("Invalid pet type entered.");
        }

        sc.close();
		
	}
}
