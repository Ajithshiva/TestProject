package LabAssSwitchCase;

import java.util.Scanner;

public class Ass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter animal name (lion, eagle, shark, elephant, penguin): ");
        String animal = sc.nextLine().toLowerCase();
        
        switch(animal) {
            case "lion":
                System.out.println("Habitat: Savanna/Grasslands");
                break;
            case "eagle":
                System.out.println("Habitat: Mountains/Forests");
                break;
            case "shark":
                System.out.println("Habitat: Oceans/Seas");
                break;
            case "elephant":
                System.out.println("Habitat: Forests/Savanna");
                break;
            case "penguin":
                System.out.println("Habitat: Antarctica/Coastal regions");
                break;
            default:
                System.out.println("Habitat information not available for this animal");
        }
        
        sc.close();

		
		
	}
}
