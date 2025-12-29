package LabAssNestedIf;

import java.util.Scanner;

public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel.");
            } else {
                System.out.println("Consonant.");
            }
        } else {
            System.out.println("Neither.");
        }

        sc.close();
		
		
	}
}
