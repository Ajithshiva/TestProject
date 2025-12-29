package Practice;

public class Try2 {

	String call(int b)
	{
		return (b+10)+" Done";
	}
	
	static void lift()
	{
		System.out.println("Lift");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Try2 x = new Try2();
		
		System.out.println(x.call(25));
		
		Try2.lift();
		
		
	}

}
