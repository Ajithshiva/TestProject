package GUT;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==1 || j==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		//2
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==3 || j==3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		//3
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<=2*(5-i)-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		//4
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j || i==6-j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		//5
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==1 || i==j || i==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
