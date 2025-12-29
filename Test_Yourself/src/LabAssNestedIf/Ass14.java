package LabAssNestedIf;

import java.util.Scanner;

public class Ass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your fitness level (beginner/intermediate/advanced): ");
        String level = sc.nextLine();

        System.out.print("Enter your fitness goal (weight loss/muscle gain/overall fitness): ");
        String goal = sc.nextLine();

        if (level.equalsIgnoreCase("beginner")) {
            if (goal.equalsIgnoreCase("weight loss")) {
                System.out.println("Suggested Routine: Light cardio, bodyweight exercises, and yoga.");
            } else if (goal.equalsIgnoreCase("muscle gain")) {
                System.out.println("Suggested Routine: Basic strength training with machines and resistance bands.");
            } else if (goal.equalsIgnoreCase("overall fitness")) {
                System.out.println("Suggested Routine: Mix of light cardio, stretching, and basic weight training.");
            } else {
                System.out.println("Invalid goal entered.");
            }
        } else if (level.equalsIgnoreCase("intermediate")) {
            if (goal.equalsIgnoreCase("weight loss")) {
                System.out.println("Suggested Routine: HIIT workouts, running, and cycling.");
            } else if (goal.equalsIgnoreCase("muscle gain")) {
                System.out.println("Suggested Routine: Free weights, compound lifts, and progressive overload.");
            } else if (goal.equalsIgnoreCase("overall fitness")) {
                System.out.println("Suggested Routine: Balanced mix of cardio, strength training, and flexibility exercises.");
            } else {
                System.out.println("Invalid goal entered.");
            }
        } else if (level.equalsIgnoreCase("advanced")) {
            if (goal.equalsIgnoreCase("weight loss")) {
                System.out.println("Suggested Routine: Intense HIIT, advanced circuit training, and endurance workouts.");
            } else if (goal.equalsIgnoreCase("muscle gain")) {
                System.out.println("Suggested Routine: Heavy weightlifting, advanced splits, and strength programming.");
            } else if (goal.equalsIgnoreCase("overall fitness")) {
                System.out.println("Suggested Routine: CrossFit, mixed martial arts, and advanced conditioning.");
            } else {
                System.out.println("Invalid goal entered.");
            }
        } else {
            System.out.println("Invalid fitness level entered.");
        }

        sc.close();
		
		
	}
}
