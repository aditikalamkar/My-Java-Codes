package BasicProgramming;

public class multiArray {
	
	public static void main(String arg[])
	{
		int num[][] = new int[3][4];
		for (int i=0 ; i<3 ; i++)
		{
			for(int j=0; j<4; j++)
			{
				num[i][j] = (int)(Math.random()*100);
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		//Enhanced for loop;
		
		for(int n[] : num)
		{
			for(int m : n)
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}

}
