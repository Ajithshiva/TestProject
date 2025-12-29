package LabAssNestedIf;

import java.util.Scanner;

public class Ass16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter recipient's interest (books/gadgets/fashion): ");
        String interest = sc.nextLine();

        System.out.print("Enter the occasion (birthday/wedding/anniversary): ");
        String occasion = sc.nextLine();

        if (interest.equalsIgnoreCase("books")) {
            if (occasion.equalsIgnoreCase("birthday")) {
                System.out.println("Suggested Gift: A bestselling novel or a personalized journal.");
            } else if (occasion.equalsIgnoreCase("wedding")) {
                System.out.println("Suggested Gift: A set of classic literature or coffee table books.");
            } else if (occasion.equalsIgnoreCase("anniversary")) {
                System.out.println("Suggested Gift: A personalized photo book or poetry collection.");
            } else {
                System.out.println("Invalid occasion entered.");
            }
        } else if (interest.equalsIgnoreCase("gadgets")) {
            if (occasion.equalsIgnoreCase("birthday")) {
                System.out.println("Suggested Gift: Wireless earbuds or a smartwatch.");
            } else if (occasion.equalsIgnoreCase("wedding")) {
                System.out.println("Suggested Gift: Smart home devices or kitchen gadgets.");
            } else if (occasion.equalsIgnoreCase("anniversary")) {
                System.out.println("Suggested Gift: A tablet or premium headphones.");
            } else {
                System.out.println("Invalid occasion entered.");
            }
        } else if (interest.equalsIgnoreCase("fashion")) {
            if (occasion.equalsIgnoreCase("birthday")) {
                System.out.println("Suggested Gift: Trendy clothing or stylish accessories.");
            } else if (occasion.equalsIgnoreCase("wedding")) {
                System.out.println("Suggested Gift: Designer handbags or jewelry.");
            } else if (occasion.equalsIgnoreCase("anniversary")) {
                System.out.println("Suggested Gift: A luxury watch or personalized fashion items.");
            } else {
                System.out.println("Invalid occasion entered.");
            }
        } else {
            System.out.println("Invalid interest entered.");
        }

        sc.close();
		
		
	}
}
