package LabAssSwitchCase;

import java.util.Scanner;

public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter shape (circle, rectangle, square, triangle):");
        String shape = sc.nextLine().toLowerCase();
        
        switch(shape) {
            case "circle":
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area of circle: " + (3.14159 * radius * radius));
                break;
                
            case "rectangle":
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.println("Area of rectangle: " + (length * width));
                break;
                
            case "square":
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Area of square: " + (side * side));
                break;
                
            case "triangle":
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                System.out.println("Area of triangle: " + (0.5 * base * height));
                break;
                
            default:
                System.out.println("Invalid shape");
        }
        
        sc.close();

		
	}
}
