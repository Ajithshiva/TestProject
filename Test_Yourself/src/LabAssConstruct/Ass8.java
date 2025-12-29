package LabAssConstruct;

import java.util.Scanner;

public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of sides of the polygon: ");
        int sides = sc.nextInt();
        
        switch(sides) {
            case 3:
                System.out.println("Triangle");
                break;
            case 4:
                System.out.println("Quadrilateral");
                break;
            case 5:
                System.out.println("Pentagon");
                break;
            case 6:
                System.out.println("Hexagon");
                break;
            case 7:
                System.out.println("Heptagon");
                break;
            case 8:
                System.out.println("Octagon");
                break;
            case 9:
                System.out.println("Nonagon");
                break;
            case 10:
                System.out.println("Decagon");
                break;
            default:
                System.out.println("Polygon type not recognized");
        }
        
        sc.close();
		
		
	}
}
