package LabAssNestedIf;

import java.util.Scanner;

public class Ass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (car/truck): ");
        String type = sc.nextLine();

        System.out.print("Enter emissions status (clean/high): ");
        String emission = sc.nextLine();

        int fee;

        if (type.equalsIgnoreCase("car")) {
            if (emission.equalsIgnoreCase("clean")) {
                fee = 2000;
            } else {
                fee = 3000;
            }
        } else if (type.equalsIgnoreCase("truck")) {
            if (emission.equalsIgnoreCase("clean")) {
                fee = 3000;
            } else {
                fee = 5000;
            }
        } else {
            fee = 0;
            System.out.println("Invalid vehicle type.");
        }

        if (fee > 0) {
            System.out.println("Registration fee: ₹" + fee);
        }

        sc.close();
		
		
	}
}
