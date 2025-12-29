package LabAssForLoop;

public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = "Hello World";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if ((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') &&
		        !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
		          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
		        count++;
		    }
		}
		System.out.println(count);

		
		
	}
}
