package LabAssConstruct;

import java.util.Scanner;

public class Ass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        int caseType;
        
        // Determine case type
        if (year % 400 == 0) {
            caseType = 2; // Gregorian leap year
        } else if (year % 4 == 0 && year % 100 != 0) {
            caseType = 1; // Leap year
        } else {
            caseType = 0; // Common year
        }
        
        switch(caseType) {
            case 2:
                System.out.println(year + " is a Gregorian leap year");
                break;
            case 1:
                System.out.println(year + " is a leap year");
                break;
            case 0:
                System.out.println(year + " is a common year");
                break;
            default:
                System.out.println("Invalid year");
        }
        
        sc.close();
		
		
	}
}
