package LabAssNestedIf;

import java.util.Scanner;

public class Ass17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] subjects = new String[n];
        int[] priorities = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter priority for " + subjects[i] + " (1 = High, 2 = Medium, 3 = Low): ");
            priorities[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        System.out.println("\nStudy Schedule (based on priority):");
        for (int p = 1; p <= 3; p++) {
            for (int i = 0; i < n; i++) {
                if (priorities[i] == p) {
                    if (p == 1) {
                        System.out.println(subjects[i] + " - High priority: Study this subject daily.");
                    } else if (p == 2) {
                        System.out.println(subjects[i] + " - Medium priority: Study this subject 3 times a week.");
                    } else {
                        System.out.println(subjects[i] + " - Low priority: Study this subject once a week.");
                    }
                }
            }
        }

        sc.close();
		
		
	}
}
