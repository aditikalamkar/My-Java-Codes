package BasicProgramming;

public class Reuseability {

	public static int getSquare(int num)
	{
		return num * num;
	}
	
	public static int getCube(int num)
	{
		return num * num * num;
	}
	
	public static void main(String args[])
	{
		for(int i = 1; i<=5 ; i++)
		{
			int res1 = getSquare(i);
			System.out.println("Square of " +i+" is : " +res1);
		}
		
		System.out.println("====================");
		
		for(int i = 1; i<=5 ; i++)
		{
			int res2 = getCube(i);
			System.out.println("Cube of " +i+" is : " +res2);
		}
	}

}
