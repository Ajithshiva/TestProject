package LabAssNestedIf;

import java.util.Scanner;

public class Ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double distance = sc.nextDouble();

        System.out.print("Enter order amount: ");
        double amount = sc.nextDouble();

        double charge;

        if (distance <= 5) {
            if (amount >= 50) {
                charge = 0;
            } else {
                charge = 5;
            }
        } else if (distance <= 10) {
            if (amount >= 100) {
                charge = 0;
            } else {
                charge = 10;
            }
        } else {
            charge = 20;
        }

        System.out.println("Delivery charge: $" + charge);

        sc.close();
		
		
	}
}
