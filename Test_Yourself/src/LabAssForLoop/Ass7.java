package LabAssForLoop;

public class Ass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
		        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		        System.out.println(ch);
		    }
		}

		
		
	}
}
