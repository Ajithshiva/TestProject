package LabAssNestedIf;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 8;
		double height = 2.9; // in feet

		if (age < 10) {
		    if (height < 3.0) {
		        System.out.println("Ticket price: $8");
		    } else {
		        System.out.println("Ticket price: $12");
		    }
		} else {
		    if (height >= 3.0) {
		        System.out.println("Ticket price: $18");
		    }
		}
		
	}
}
