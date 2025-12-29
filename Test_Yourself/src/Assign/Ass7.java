package Assign;

public class Ass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int count =1;
		int k=1;
		char d='A';
		for (int r=0; r<5; r++) {
			for (int c=0;c<5;c++) {
				if (count%2!=0) {
					System.out.print(k);
					k++;
				}else {
					System.out.print(d);
					d++;
				}
				count++;
				
			}
			System.out.println();
		}
		
	}

}
