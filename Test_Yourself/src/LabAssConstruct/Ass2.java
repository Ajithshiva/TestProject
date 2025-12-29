package LabAssConstruct;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 2; // 1 for Jan, 2 for Feb, ..., 12 for Dec
		int year = 2024; // Needed for February leap year check

		switch(month) {
		    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		        System.out.println("31 days");
		        break;
		    case 4: case 6: case 9: case 11:
		        System.out.println("30 days");
		        break;
		    case 2:
		        // Check for leap year
		        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		            System.out.println("29 days (Leap year)");
		        } else {
		            System.out.println("28 days");
		        }
		        break;
		    default:
		        System.out.println("Invalid month");
		}


		
	}
}
