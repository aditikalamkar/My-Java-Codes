package BasicProgramming;

public class Method {
	public static int square(int num)
	{
		return num*num;
	}

	public static int cube(int num)
	{
		return num*num*num;
	}
	
	public static void main(String args[])
	{
		int res1 = square(14);
		int res2 = cube(15);
		System.out.println("Square of 10 is " +res1);
		System.out.println("Cube of 10 is " +res2);
	}
}
