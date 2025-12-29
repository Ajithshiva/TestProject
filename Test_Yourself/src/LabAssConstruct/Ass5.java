package LabAssConstruct;

import java.util.Scanner;

public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter numerical grade (0-100): ");
        int grade = sc.nextInt();
        int score = grade / 10; // Divide by 10 to simplify switch cases
        
        switch(score) {
            case 10: // 100
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
        
        sc.close();
		
		
	}
}
