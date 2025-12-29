package LabAssNestedIf;

import java.util.Scanner;

public class Ass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter your budget: ");
        int budget = sc.nextInt();

        if (budget < 10000) {
            System.out.println("For " + destination + ": Choose budget travel and stay in hostels.");
        } else if (budget <= 50000) {
            System.out.println("For " + destination + ": You can choose flights and stay in 3-star hotels.");
        } else {
            System.out.println("For " + destination + ": Enjoy luxury travel and 5-star accommodations.");
        }

        sc.close();
		
		
	}
}
