package LabAssNestedIf;

import java.util.Scanner;

public class Ass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature (°C): ");
        int temp = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Is it raining? (yes/no): ");
        String rain = sc.nextLine();

        if (temp < 15) {
            if (rain.equalsIgnoreCase("yes")) {
                System.out.println("Wear a warm jacket and carry an umbrella.");
            } else {
                System.out.println("Wear a warm jacket.");
            }
        } else if (temp <= 25) {
            if (rain.equalsIgnoreCase("yes")) {
                System.out.println("Wear light clothes and carry an umbrella.");
            } else {
                System.out.println("Wear light clothes.");
            }
        } else {
            if (rain.equalsIgnoreCase("yes")) {
                System.out.println("Wear very light clothes and carry an umbrella.");
            } else {
                System.out.println("Wear very light clothes.");
            }
        }

        sc.close();
		
		
	}
}
