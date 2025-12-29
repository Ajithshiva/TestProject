package LabAss;

public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int g = -43;
		boolean c = true;
		if (g>1)	{
			for (int k=2;k<g;k++)	{
				
				if (g%k == 0)	{
					c = false;
					break;
				}
			}
			if (c) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not a Prime");
			}
		}
		else {
			System.out.println("Not a Natural Number > 1");
		}
		
		
	}
}
