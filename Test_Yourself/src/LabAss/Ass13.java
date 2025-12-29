package LabAss;

public class Ass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int z = 625 ;
		boolean s = false;
		for (int k=1;k*k<=z;k++)	{
			if (k*k==z)	{
				s=true;
				break;
			}
		}
		if (s)	{
			System.out.println("perfect square");
		}else {
			System.out.println("Not a perfect square");
		}
		
		
	}
}
