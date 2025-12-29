package LabAssNestedIf;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 22;
		int income = 35000;

		if (age < 18) {
		    System.out.println("You are underage.");
		} else {
		    if (income < 40000) {
		        System.out.println("Your income is too low for a credit card.");
		    } else {
		        System.out.println("You are eligible for a credit card.");
		    }
		}

		
	}
}
