package LabAssConstruct;

import java.util.Scanner;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter conversion type: 1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + "°C = " + fahrenheit + "°F");
                break;

            case 2: // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println(fahrenheit + "°F = " + celsius + "°C");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
		
	}
}
