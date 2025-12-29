package LabAss;

public class Ass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a = 1901;
		if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))	{
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a Leap Year");
		}
		
		
	}
}
