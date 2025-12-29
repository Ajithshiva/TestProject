package LabAssConstruct;

import java.util.Scanner;

public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee type (1-Manager, 2-Developer, 3-Tester, 4-Intern):");
        int type = sc.nextInt();
        double salary = 0;

        switch(type) {
            case 1: // Manager
                System.out.print("Enter basic salary: ");
                double managerBasic = sc.nextDouble();
                salary = managerBasic + (managerBasic * 0.2); // 20% bonus
                System.out.println("Manager Salary: " + salary);
                break;
                
            case 2: // Developer
                System.out.print("Enter basic salary: ");
                double devBasic = sc.nextDouble();
                salary = devBasic + (devBasic * 0.15); // 15% bonus
                System.out.println("Developer Salary: " + salary);
                break;
                
            case 3: // Tester
                System.out.print("Enter basic salary: ");
                double testerBasic = sc.nextDouble();
                salary = testerBasic + (testerBasic * 0.1); // 10% bonus
                System.out.println("Tester Salary: " + salary);
                break;
                
            case 4: // Intern
                System.out.print("Enter stipend: ");
                double stipend = sc.nextDouble();
                salary = stipend; // No bonus
                System.out.println("Intern Salary: " + salary);
                break;
                
            default:
                System.out.println("Invalid employee type");
        }
        
        sc.close();
		
		
	}
}
